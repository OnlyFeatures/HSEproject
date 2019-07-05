package com.example.doctor

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Day_d: AppCompatActivity(){
    companion object{
        const val dataname = "data"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day)
        /*val DN = intent.getStringArrayExtra(dataname)
        val name1 =  DN.get(1)
        val datas = DN.get(0)*/
        val datas = intent.getStringExtra(dataname)
        val text = findViewById<TextView>(R.id.textView)
        text.text = datas
        /*updateAvalTime(name1) {
            initRecycler(datas)
        }*/
        initRecycler(datas)

    }
    private fun initRecycler(datas:String) {
        val list = List(24,{i->""+i+":00"})

        val recycler = findViewById <RecyclerView>(R.id.recyclerList)
        recycler.adapter = DayAdapter(list, datas)
        recycler.layoutManager = LinearLayoutManager(this)
    }

}
