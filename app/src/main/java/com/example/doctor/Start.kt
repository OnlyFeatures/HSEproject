package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Start :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.start)
        val sign_in = findViewById<Button>(R.id.button2)
        val enter = findViewById<Button>(R.id.button1)
        sign_in.setOnClickListener{
            val intent = Intent(this, Sign_in::class.java)
            startActivity(intent)
        }
        enter.setOnClickListener{
            val intent = Intent(this, Enter::class.java)
            startActivity(intent)
        }
    }
}