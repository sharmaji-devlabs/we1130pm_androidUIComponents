package com.app.androiduipartone.android_views.custom_dialog

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class ExampleOfCustomDialog : AppCompatActivity() {
    private lateinit var customDialog : Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_example_of_custom_dialog)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ========= CUSTOM DIALOG SETUP ================
        customDialog = Dialog(this@ExampleOfCustomDialog)

        customDialog.setContentView(R.layout.custom_alert_dialog)
        customDialog.setCancelable(false)
        val btnCancel = customDialog.findViewById<Button>(R.id.dialog_cancel)
        val btnSave = customDialog.findViewById<Button>(R.id.dialog_save)

        btnSave.setOnClickListener {
            Toast.makeText(this@ExampleOfCustomDialog, "Dialog Working...", Toast.LENGTH_SHORT).show()
            customDialog.cancel()
        }

        btnCancel.setOnClickListener {
            customDialog.cancel()
        }

        val btnPopup = findViewById<Button>(R.id.btn_cutom_dialog)

        btnPopup.setOnClickListener {
            customDialog.show()
        }

    }
}