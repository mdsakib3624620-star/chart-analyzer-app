package com.example.chartanalyzer

class MainActivity {

    private val candleAnalyzer = CandleAnalyzer()
    private val trendAnalyzer = TrendAnalyzer()
    private val signalEngine = SignalEngine()
    private val cameraAnalyzer = CameraAnalyzer()

    fun runAnalysis(): String {

        cameraAnalyzer.startScan()

        val trend = trendAnalyzer.detectTrend(
            currentPrice = 101.0,
            previousPrice = 100.0
        )

        val candleStrength = candleAnalyzer.calculateStrength(
            body = 8.0,
            wick = 2.0
        )

        val signal = signalEngine.generateSignal(
            trend = trend,
            candleStrength = candleStrength
        )

        return "Trend: $trend | Candle: $candleStrength% | Signal: $signal"
    }

}
