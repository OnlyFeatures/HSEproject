package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class Sign_in_p : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_p)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val name = findViewById<EditText>(R.id.editText1).getText().toString()
            val password = findViewById<EditText>(R.id.editText2).getText().toString()
            val account = arrayListOf (password)
            //val res = arrayListOf(account, avalTime)
            getPerson(name, arrayListOf(account, arrayListOf()))

            val intent = Intent(this, Account_p::class.java)
            intent.putExtra(Account_d.NAME, name)
            startActivity(intent)
        })


    }

}