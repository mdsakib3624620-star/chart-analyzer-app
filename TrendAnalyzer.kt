package com.example.chartanalyzer

class TrendAnalyzer {

    fun detectTrend(
        currentPrice: Double,
        previousPrice: Double
    ): String {

        return when {
            currentPrice > previousPrice -> "UP"
            currentPrice < previousPrice -> "DOWN"
            else -> "SIDEWAYS"
        }
    }

}
