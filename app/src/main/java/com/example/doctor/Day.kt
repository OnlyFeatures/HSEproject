package com.example.doctor

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Day: AppCompatActivity(){
    companion object{
        const val data = "data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day)
        val datas = intent.getStringExtra(data)
        val text = findViewById<TextView>(R.id.textView)
        text.setText(datas)
        initRecycler()
    }
    private fun initRecycler() {
        val list = List(24,{i->""+i+":00"})

        val recycler = findViewById <RecyclerView>(R.id.recyclerList)
        recycler.adapter = CalendarAdapter(list)
        recycler.layoutManager = LinearLayoutManager(this)
    }
}