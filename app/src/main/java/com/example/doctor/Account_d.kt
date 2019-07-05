package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Account_d : AppCompatActivity() {
    companion object{
        const val NAME = "name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_d)
        val button1 = findViewById<Button>(R.id.button1)
        val name1 = intent.getStringExtra(NAME)
        //val readed= read(name1)
        //val account = readed.get(0)
        //avalTime = readed.get(1)
        button1.setOnClickListener{
            val intent = Intent(this, Calendar_d::class.java)
            intent.putExtra(Calendar_d.NAME, name1)
            startActivity(intent)
        }
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            updateTablePerson(name1) {
                avalTime = arrayListOf<String>()
                val intent = Intent(this, Start::class.java)
                startActivity(intent)
            }
        }

        //save("123", "abc")

    }


}
