package com.example.chartanalyzer

import android.app.Activity
import android.os.Bundle
import android.content.Intent
import android.provider.MediaStore
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {

    private val analysisManager = AnalysisManager()
    private lateinit var resultText: TextView

    private val CAMERA_CODE = 2000
    private val IMAGE_CODE = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val scanButton = findViewById<Button>(R.id.scanButton)
        val imageButton = findViewById<Button>(R.id.imageButton)
        resultText = findViewById(R.id.resultText)

        // Live Camera
        scanButton.setOnClickListener {

            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

            startActivityForResult(
                cameraIntent,
                CAMERA_CODE
            )
        }

        // Screenshot / Gallery
        imageButton.setOnClickListener {

            val imageIntent = Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            )

            startActivityForResult(
                imageIntent,
                IMAGE_CODE
            )
        }
    }

    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) {

        super.onActivityResult(
            requestCode,
            resultCode,
            data
        )

        if (resultCode == RESULT_OK) {

            when(requestCode){

                CAMERA_CODE -> {
                    resultText.text =
                        "Camera image received. Analyzing..."
                }

                IMAGE_CODE -> {
                    resultText.text =
                        "Screenshot received. Analyzing..."
                }
            }
        }
    }
}
