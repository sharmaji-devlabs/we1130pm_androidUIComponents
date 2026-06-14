package com.app.androiduipartone.checkbox_view

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class CheckBoxView : AppCompatActivity() {

    private lateinit var fillThisField : EditText
    private lateinit var chkbx : CheckBox
    private lateinit var btnChxbx : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_check_box_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewInitialize() // initialize all view by this method

        val termsConditionDialogBox = AlertDialog.Builder(this@CheckBoxView)

        termsConditionDialogBox.setTitle("Please visit this Terms & Conditions")

        termsConditionDialogBox.setCancelable(false)

        termsConditionDialogBox.setPositiveButton("Close"){
            dialog, which -> dialog.cancel()
        }


        btnChxbx.setOnClickListener {
            val value = fillThisField.text.toString()
            if (value.isEmpty()){
                fillThisField.error = "fillup mandatory"
                return@setOnClickListener
            }

            if (!chkbx.isChecked){
//                chkbx.error = "Please check terms and conditions"
                termsConditionDialogBox.show()
                return@setOnClickListener
            }

            Toast.makeText(this@CheckBoxView, value, Toast.LENGTH_SHORT).show()

        }




    }

    private fun viewInitialize(){
        fillThisField = findViewById(R.id.fill_this_field)
        chkbx = findViewById(R.id.chkbx_terms_condition)
        btnChxbx = findViewById(R.id.btn_chkbx)
    }

}