package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class Sign_in_d : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in_d)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val name = findViewById<EditText>(R.id.editText1).getText().toString()
            val password = findViewById<EditText>(R.id.editText2).getText().toString()
            val account = arrayListOf (password, "doctor")
            //val res = arrayListOf(account, avalTime)
            getPerson(name, arrayListOf(account, arrayListOf()))

            val intent = Intent(this, Account_d::class.java)
            intent.putExtra(Account_d.NAME, name)
            startActivity(intent)
        })


    }

}