package com.example.chartanalyzer

class SupportResistance {

    fun findSupportResistance(
        prices: List<Double>
    ): String {

        if (prices.isEmpty()) {
            return "NO DATA"
        }

        val highest = prices.maxOrNull()
        val lowest = prices.minOrNull()

        return "Resistance: $highest, Support: $lowest"
    }

}
