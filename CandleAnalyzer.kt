package com.example.chartanalyzer

class CandleAnalyzer {

    fun calculateStrength(
        body: Double,
        wick: Double
    ): Int {

        val strength = ((body / (body + wick)) * 100).toInt()

        return if (strength > 100) {
            100
        } else {
            strength
        }
    }

}
