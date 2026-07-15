package com.example.chartanalyzer

class SupportResistance {

    fun findLevels(prices: List<Double>): String {

        if (prices.isEmpty()) {
            return "NO DATA"
        }

        val support = prices.minOrNull() ?: 0.0
        val resistance = prices.maxOrNull() ?: 0.0

        return """
            Support: $support
            Resistance: $resistance
        """.trimIndent()
    }

}
