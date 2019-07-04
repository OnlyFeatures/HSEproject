package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import org.w3c.dom.Text

class Account : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, Calendar::class.java)
            startActivity(intent)
        }
        //save("123", "abc")

    }
    fun save(key: String, value: String){
        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference(key)
        ref.setValue(value)
    }
   /* fun get(key:String, cb:(String)->Unit){
        val database = FirebaseDatabase.getInstance()
        val ref = database.getReference(key)
        ref.addListenerForSingleValueEvent(object :ValueEventListener{
            override fun onCancelled(p0: DatabaseError) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onDataChange(p0: DataSnapshot) {
                val value = p0.getValue()
            }
        }
    }*/
}
