package com.example.doctor

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Day_p :AppCompatActivity(){
    companion object{
        const val data = "data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day)
        val datas = intent.getStringExtra(data)
        val text = findViewById<TextView>(R.id.textView)
        text.setText(datas)
        initRecycler(datas)
    }
    private fun initRecycler(datas:String) {
        val list = arrayListOf("Василий Васин", "FireBase DataBase", "Лечащий врач")
        val recycler = findViewById <RecyclerView>(R.id.recyclerList)
        recycler.adapter = DayAdapter(list, datas)
        recycler.layoutManager = LinearLayoutManager(this)
    }
}