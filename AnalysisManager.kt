package com.example.chartanalyzer

class AnalysisManager {

    private val candleAnalyzer = CandleAnalyzer()
    private val trendAnalyzer = TrendAnalyzer()
    private val supportResistance = SupportResistance()
    private val signalEngine = SignalEngine()

    fun runAnalysis(): String {

        val prices = listOf(
            100.0,
            101.0,
            102.0,
            103.0
        )

        val trend = trendAnalyzer.detectTrend(prices)

        val candle = candleAnalyzer.analyze(
            open = 100.0,
            close = 103.0,
            high = 104.0,
            low = 99.0
        )

        val level =
            supportResistance.findLevels(prices)

        val signal =
            signalEngine.generateSignal(
                trend = trend,
                candleStrength = 70,
                support = true,
                resistance = false
            )

        return """
            Trend: $trend

            Candle:
            $candle

            Levels:
            $level

            Signal: $signal
        """.trimIndent()
    }
}
