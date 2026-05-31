package com.app.androiduipartone.android_views

import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R
import com.google.android.material.snackbar.Snackbar

class SnackbarViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_snackbar_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnSnackbar = findViewById<LinearLayout>(R.id.btn_snackbar)

        btnSnackbar.setOnClickListener {
            // pre-defined snackbar
            Snackbar.make(this@SnackbarViewActivity, btnSnackbar, "Hello world", Snackbar.LENGTH_SHORT).setAction("undo", object:
                View.OnClickListener{
                override fun onClick(p0: View?) {
                    Toast.makeText(this@SnackbarViewActivity, "Snackbar action", Toast.LENGTH_SHORT).show()
                }
                }).show()
        }
    }
}