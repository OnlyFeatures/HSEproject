package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Enter_p : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter_p)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val name = findViewById<EditText>(R.id.editText1).getText().toString()
            val password = findViewById<EditText>(R.id.editText2).getText().toString()
            if(read(name).get(0).get(0) == password){
                val intent = Intent(this, Account_p::class.java)
                intent.putExtra(Account_d.NAME, name)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Вы не зарегистрировались", Toast.LENGTH_SHORT)
            }
        })


    }

}