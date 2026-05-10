package com.app.androiduipartone.eventlistner_practic

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class BasicFormInput : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_basic_form_input)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val inputName = findViewById<EditText>(R.id.input_name)
        val inputEmail = findViewById<EditText>(R.id.input_email)
        val inputAdd = findViewById<EditText>(R.id.input_add)
        val inputContact = findViewById<EditText>(R.id.input_contact)

        val textName = findViewById<TextView>(R.id.txt_name)
        val textEmail = findViewById<TextView>(R.id.txt_email)
        val textContact = findViewById<TextView>(R.id.txt_contact)
        val textAddress = findViewById<TextView>(R.id.txt_address)


        val btnSubmit : Button = findViewById(R.id.btn_submit)

        btnSubmit.setOnClickListener {
            // collecting all info from fields
            val name = inputName.text.toString()
            val email = inputEmail.text.toString()
            val contact = inputContact.text.toString()
            val address = inputAdd.text.toString()

            // setting up all values from fields
            textName.text = name
            textEmail.text = email
            textContact.text = contact
            textAddress.text = address

            // clearing all fields
            inputName.text.clear()
            inputEmail.text.clear()
            inputAdd.text.clear()
            inputContact.text.clear()

        }


    }
}