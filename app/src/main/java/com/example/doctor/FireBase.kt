package com.example.doctor

import android.util.Log
import android.widget.Toast
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

var avalTime = arrayListOf<String>()
fun getPerson(name: String, res:ArrayList<ArrayList<String>>, cb: () -> Unit = {}){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    ref.setValue(res)
    cb()
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
fun read(name:String, cb:(Any) -> Unit) {
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    ref.addListenerForSingleValueEvent(object :ValueEventListener{
        override fun onCancelled(p0: DatabaseError) {

        }

        override fun onDataChange(p0: DataSnapshot) {
            val value = p0.getValue()
            if (value != null) {
                cb(value)
            }
        }
    })
}
fun checkd(name:String, password: String, cb:(Boolean)->Unit){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    read(name){read->
        read as ArrayList<ArrayList<String>>
        cb(read.get(0).get(0) == password&&read.get(0).get(1) == "doctor")
        /*if (read.get(0).get(0)  = password){

        }*/
    }
}
fun checkp(name:String, password: String, cb:(Boolean)->Unit){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    read(name){read->
        read as ArrayList<ArrayList<String>>
        cb(read.get(0).get(0) == password&&read.get(0).get(1) == "")
        /*if (read.get(0).get(0)  = password){

        }*/
    }
}

fun updateTablePerson(name:String, cb: () -> Unit){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)

    read(name) { read ->
        Log.i("Firebase", read::class.java.simpleName)
        read as ArrayList<ArrayList<String>>

        getPerson(name, arrayListOf(read.get(0), avalTime), cb)
        /*val outer = arrayListOf<ArrayList<String>>()
        outer.add(ArrayList(read.get(0)))
        outer.add(avalTime)
        getPerson(name, outer)*/
    }
    /*val account = read(name).get(0)
    val res = arrayListOf(account, avalTime)
    getPerson(name, res)*/
}
fun updateAvalTime(name: String, cb:()->Unit){
    val database = FirebaseDatabase.getInstance()
    val ref = database.getReference(name)
    read(name){read->
        read as ArrayList<ArrayList<String>>
        avalTime = read.get(1)
        cb()
    }
}