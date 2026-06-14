package com.app.androiduipartone.component_views

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.app.androiduipartone.R

class ComponentActivityOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_component_one)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val post1 : View = findViewById<View>(R.id.post_1)
        val post2 : View = findViewById<View>(R.id.post_2)
        val post3 : View = findViewById<View>(R.id.post_3)
        val post4 : View = findViewById<View>(R.id.post_4)
        val post5 : View = findViewById<View>(R.id.post_5)



        post1.setOnClickListener {
            val username : TextView = post1.findViewById(R.id.username)
            username.text = "User one"
            Toast.makeText(this@ComponentActivityOne, "Post card one", Toast.LENGTH_SHORT).show()
        }

        post2.setOnClickListener {
            val username : TextView = post2.findViewById(R.id.username)
            username.text = "User second"
            Toast.makeText(this@ComponentActivityOne, "Post card Second", Toast.LENGTH_SHORT).show()
        }

        post3.setOnClickListener {
            val username : TextView = post3.findViewById(R.id.username)
            username.text = "User third"
            Toast.makeText(this@ComponentActivityOne, "Post card Third", Toast.LENGTH_SHORT).show()
        }

        post4.setOnClickListener {
            val username : TextView = post4.findViewById(R.id.username)
            username.text = "User four"
            Toast.makeText(this@ComponentActivityOne, "Post card Four", Toast.LENGTH_SHORT).show()
        }

        post5.setOnClickListener {
            val username : TextView = post5.findViewById(R.id.username)
            username.text = "User five"
            Toast.makeText(this@ComponentActivityOne, "Post card Five", Toast.LENGTH_SHORT).show()
        }

    }
}