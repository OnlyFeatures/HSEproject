package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Sign_in: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)
        val sign_in_p = findViewById<Button>(R.id.button2)
        val sign_in_d = findViewById<Button>(R.id.button1)
        sign_in_p.setOnClickListener{
            val intent = Intent(this, Sign_in_p::class.java)
            startActivity(intent)
        }
        sign_in_d.setOnClickListener{
            val intent = Intent(this, Sign_in_d::class.java)
            startActivity(intent)
        }
    }
}