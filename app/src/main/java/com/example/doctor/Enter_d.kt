package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Enter_d : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enter_d)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            val name = findViewById<EditText>(R.id.editText1).getText().toString()
            val password = findViewById<EditText>(R.id.editText2).getText().toString()
            checkd(name, password) { success ->
                if (success) {
                    val intent = Intent(this, Account_d::class.java)
                    intent.putExtra(Account_d.NAME, name)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Вы не зарегистрировались или не врач", Toast.LENGTH_SHORT)
                }
            }
           /* if(read(name).get(0).get(0) == password){
                val intent = Intent(this, Account_d::class.java)
                intent.putExtra(Account_d.NAME, name)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Вы не зарегистрировались", Toast.LENGTH_SHORT)
            }*/
            //val account = arrayListOf (password)
            //val res = arrayListOf(account, avalTime)


        })


    }

}