package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Enter :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter)
        val enter_p = findViewById<Button>(R.id.button2)
        val enter_d = findViewById<Button>(R.id.button1)
        enter_p.setOnClickListener{
            val intent = Intent(this, Enter_p::class.java)
            startActivity(intent)
        }
        enter_d.setOnClickListener{
            val intent = Intent(this, Enter_d::class.java)
            startActivity(intent)
        }
    }
}