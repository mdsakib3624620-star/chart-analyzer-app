package com.example.chartanalyzer

class CandleAnalyzer {

    fun analyze(
        open: Double,
        close: Double,
        high: Double,
        low: Double
    ): String {

        val body = kotlin.math.abs(close - open)

        val upperWick = high - maxOf(open, close)

        val lowerWick = minOf(open, close) - low

        val type = if (close > open) {
            "BULLISH"
        } else {
            "BEARISH"
        }

        val strength =
            ((body / (high - low)) * 100).toInt()

        return """
            Type: $type
            Body: $body
            Upper Wick: $upperWick
            Lower Wick: $lowerWick
            Strength: $strength%
        """.trimIndent()
    }

}
