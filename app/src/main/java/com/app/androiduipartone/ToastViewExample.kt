package com.app.androiduipartone

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ToastViewExample : AppCompatActivity(), View.OnClickListener {
    lateinit var toast: Toast
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toast_view_example)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
        Event Handling
            1. find view by id from xml file : use findViewById(view_id)
            Note : this method is generic method
            2. to represent id from xml views
                Syntax : R.id.id_name
            3. Perfom any operation
         */

        val button = findViewById<Button>(R.id.btn_toast)
        button.text = "SHOW TOAST 😊😊"
        // Below toast is Built-in Toast
        toast = Toast.makeText(applicationContext, "Hello world...", Toast.LENGTH_SHORT) // 2.5s
//        val toast: Toast = Toast.makeText(applicationContext, "Hello world...", Toast.LENGTH_LONG) // 3.4s

        // button operations
        // Event Handling : onClick Listener
//        button.setOnClickListener(object : View.OnClickListener {
//            override fun onClick(view: View?) {
//                toast.show() // to show toast on screen use .show()
//            }
//        })

        // passing LAMBDA FUNCTION
        button.setOnClickListener({
            view ->
            toast.show()
        })

        button.setOnClickListener {
                view ->
            toast.show()
        }






//        button.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        toast.show() // to show toast on screen use .show()
    }

    // onclick custom method by onClick xml property
    fun onclick_button(view : View?){
        toast.show() // to show toast on screen use .show()

    }



}