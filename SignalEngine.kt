package com.example.chartanalyzer

class SignalEngine {

    fun generateSignal(
        trend: String,
        candleStrength: Int
    ): String {

        if (trend == "UP" && candleStrength >= 70) {
            return "CALL"
        }

        if (trend == "DOWN" && candleStrength >= 70) {
            return "PUT"
        }

        return "WAIT"
    }
}
