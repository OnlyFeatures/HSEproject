package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity

class Calendar_d: AppCompatActivity() {

    companion object{
        const val NAME = "name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)
        val name = intent.getStringExtra(NAME)
        val calendar = this.findViewById<CalendarView>(R.id.calendarView)
        calendar.setOnDateChangeListener(CalendarView.OnDateChangeListener { view, year, month, day ->
            val intent = Intent(this, Day_d::class.java)
            //intent.putExtra(Day_d.dataname, arrayListOf("" + day + "/" + (month + 1).toString()+"/"+year, name))
            intent.putExtra(Day_d.dataname, "" + day + "/" + (month + 1).toString()+"/"+year)
            this.startActivity(intent)

        })
    }
}