package com.app.androiduipartone.android_views

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class PreDefinedAlertDialog : AppCompatActivity() {
    private lateinit var btnAlert: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pre_defined_alert_dialog)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnAlert = findViewById(R.id.btn_alert)

        val alertBox = AlertDialog.Builder(this@PreDefinedAlertDialog)
        alertBox.setIcon(R.drawable.home)
        alertBox.setTitle(R.string.app_name)
//        alertBox.setTitle("title")
        alertBox.setMessage("Do you want to quite?")

        alertBox.setNegativeButton("Exit", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, p1: Int) {
            Toast.makeText(this@PreDefinedAlertDialog, "Negative", Toast.LENGTH_SHORT).show()
            }
        })

        alertBox.setPositiveButton("continue", { dialog, intValue ->
            Toast.makeText(this@PreDefinedAlertDialog, "Positive", Toast.LENGTH_SHORT)
                .show()
        })

        alertBox.setNeutralButton("Cancel", {
            dialog, p ->
            dialog.cancel()
        })


        btnAlert.setOnClickListener {
            alertBox.show()
        }

    }
}