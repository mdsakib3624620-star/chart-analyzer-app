package com.example.chartanalyzer

class AnalysisManager {

    private val candleAnalyzer = CandleAnalyzer()
    private val candleDetector = CandleDetector()
    private val trendAnalyzer = TrendAnalyzer()
    private val supportResistance = SupportResistance()
    private val signalEngine = SignalEngine()
    private val imageAnalyzer = ImageAnalyzer()


    fun analyzeChart(imagePath: String): String {

        val imageResult =
            imageAnalyzer.analyzeImage(imagePath)

        val candleResult =
            candleDetector.detect()

        val prices = listOf(
            100.0,
            101.0,
            102.0,
            103.0
        )

        val trend =
            trendAnalyzer.detectTrend(prices)

        val levels =
            supportResistance.findLevels(prices)

        val signal =
            signalEngine.generateSignal(
                trend = trend,
                candleStrength = 70,
                support = true,
                resistance = false
            )


        return """
        $imageResult
        
        $candleResult
        
        Trend:
        $trend
        
        Levels:
        $levels
        
        Final Signal:
        $signal
        """.trimIndent()
    }

}
