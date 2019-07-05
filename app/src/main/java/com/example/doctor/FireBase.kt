package com.example.doctor

import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

var avalTime = arrayListOf<String>()
fun getPerson(name: String, res:ArrayList<ArrayList<String>>){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    ref.setValue(res)
}
/*fun reader(key: String, cb: (String) -> Unit) {
    read(key, this::onError, cb)
}

fun read(name: String: String, error: (Throwable) -> Unit, cb: (String) -> Unit) {// олучает имя, возвращает значение массив вэтом ключе
    val database = FirebaseDatabase.getInstance()
    val ref      = database.getReference(key)
    ref.addListenerForSingleValueEvent(ValueEventListener{

        val value = DataSnapshot()
    })

    /*ref.addListenerForSingleValueEvent(object: ValueEventListener {
        override fun onCancelled(p0: DatabaseError) {
            error(p0.toException())
        }
        override fun onDataChange(p0: DataSnapshot) {
            val value = p0.getValue(String::class.java)
            if (value != null) {
                cb(value)
            }
        }
    })*/
}

fun onError(t: Throwable) {
    Toast.makeText(this, "Oops! Error", Toast.LENGTH_LONG).show()
}*/
fun read(name:String, cb:(String)->Unit){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    ref.addListenerForSingleValueEvent(object :ValueEventListener{
        override fun onCancelled(p0: DatabaseError) {

        }

        override fun onDataChange(p0: DataSnapshot) {
            val value = p0.getValue()
            
        }
    }


}
fun updateTablePerson(name:String){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    val account = read(name).get(0)
    val res = arrayListOf(account, avalTime)
    getPerson(name, res)
}