package com.example.chartanalyzer

class CameraAnalyzer {

    var lastImage: String = ""

    fun startScan(): String {
        return "Camera Scan Ready"
    }

    fun analyzeImage(imagePath: String): String {

        lastImage = imagePath

        // এখানে পরে:
        // - Candle detection
        // - Chart pattern detection
        // - Price movement analysis
        // যোগ করা হবে

        return "Screenshot received"
    }

}
