package com.example.chartanalyzer

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val scanButton = findViewById<Button>(R.id.scanButton)
        val imageButton = findViewById<Button>(R.id.imageButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        scanButton.setOnClickListener {
            resultText.text = "Camera scanning..."
        }

        imageButton.setOnClickListener {
            resultText.text = "Analyzing chart..."
        }
    }
}
