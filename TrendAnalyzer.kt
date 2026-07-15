package com.example.chartanalyzer

class TrendAnalyzer {

    fun detectTrend(prices: List<Double>): String {

        if (prices.size < 2) {
            return "NO DATA"
        }

        var up = 0
        var down = 0

        for (i in 1 until prices.size) {

            if (prices[i] > prices[i - 1]) {
                up++
            }

            if (prices[i] < prices[i - 1]) {
                down++
            }
        }

        return when {
            up > down -> "UP"
            down > up -> "DOWN"
            else -> "SIDEWAYS"
        }
    }

}
