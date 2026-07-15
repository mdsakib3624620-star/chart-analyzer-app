package com.example.chartanalyzer

class SignalEngine {

    fun generateSignal(
        trend: String,
        candleStrength: Int,
        support: Boolean,
        resistance: Boolean
    ): String {

        var score = 0

        if (trend == "UP") {
            score += 1
        }

        if (trend == "DOWN") {
            score -= 1
        }

        if (candleStrength >= 70) {
            score += 1
        }

        if (support) {
            score += 1
        }

        if (resistance) {
            score -= 1
        }

        return when {
            score >= 2 -> "CALL"
            score <= -2 -> "PUT"
            else -> "WAIT"
        }
    }
}
