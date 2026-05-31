package com.app.androiduipartone.android_views

import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class ImageButtonExample : AppCompatActivity() {

    private lateinit var iconBtn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_button_example)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        iconBtn = findViewById(R.id.btn_icon)
        iconBtn.setOnClickListener {
            Toast.makeText(this@ImageButtonExample, "Image button trigger", Toast.LENGTH_SHORT).show()
        }


    }
}