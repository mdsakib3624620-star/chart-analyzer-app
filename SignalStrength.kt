package com.example.chartanalyzer

class SignalStrength {

    fun calculate(
        trend: String,
        candleStrength: Int,
        support: Boolean,
        resistance: Boolean
    ): Int {

        var score = 0

        if (trend == "UP" || trend == "DOWN") {
            score += 30
        }

        if (candleStrength >= 70) {
            score += 40
        }

        if (support || resistance) {
            score += 30
        }

        return if (score > 100) {
            100
        } else {
            score
        }
    }
}
