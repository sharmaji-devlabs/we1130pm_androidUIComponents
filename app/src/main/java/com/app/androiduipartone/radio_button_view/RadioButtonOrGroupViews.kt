package com.app.androiduipartone.radio_button_view

import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class RadioButtonOrGroupViews : AppCompatActivity() {

    private lateinit var maleRadio : RadioButton
    private lateinit var feMaleRadio : RadioButton
    private lateinit var otherRadio : RadioButton
    private lateinit var selectedGender : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_radio_button_or_group_views)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        viewInitialization()

//        maleRadio.setOnClickListener {
////            selectedGender.text = "Male"
//            selectedGender.text = maleRadio.text
//        }
//
//        feMaleRadio.setOnClickListener {
//            selectedGender.text = "Female"
//        }
//
//        otherRadio.setOnClickListener {
//            selectedGender.text = "Others"
//        }
        val radioIds = arrayOf(R.id.rd_male, R.id.rd_female, R.id.rd_other)
        val radioBtns = Array<RadioButton>(3, {index -> findViewById(radioIds[index])})

        for (button in radioBtns){
            button.setOnClickListener {
                selectedGender.text = button.text
            }
        }


    }

    private fun viewInitialization(){
        maleRadio = findViewById(R.id.rd_male)
        feMaleRadio = findViewById(R.id.rd_female)
        otherRadio = findViewById(R.id.rd_other)
        selectedGender = findViewById(R.id.selected_gender)



    }



}