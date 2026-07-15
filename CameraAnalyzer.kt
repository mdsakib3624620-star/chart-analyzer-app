package com.example.chartanalyzer

class CameraAnalyzer {

    var isScanning = false

    fun startScan(): String {
        isScanning = true

        return "Camera Scan Started"
    }

    fun stopScan(): String {
        isScanning = false

        return "Camera Scan Stopped"
    }

    fun analyzeImage(imagePath: String): String {
        // Screenshot/Camera image analysis will be added here

        return "Image received: $imagePath"
    }

}
