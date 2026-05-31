package com.app.androiduipartone.android_views

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class CustomToastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_toast)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    // Initialization
        val edtText : AppCompatEditText = findViewById(R.id.edt_text)
        val btnCustomToast : AppCompatButton = findViewById(R.id.btn_custom_toast)
        val customToastView : View = layoutInflater.inflate(R.layout.custom_toast_view, null)
        val toastTextView : TextView = customToastView.findViewById(R.id.toast_text)

        // custom toast
        val toast: Toast = Toast(this@CustomToastActivity)


        btnCustomToast.setOnClickListener {
            val text : String = edtText.text.toString()
            toastTextView.text = text
            toast.view = customToastView
            toast.duration = Toast.LENGTH_LONG
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }



    }
}