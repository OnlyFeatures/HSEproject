package com.example.doctor

import android.content.Intent
import android.os.Bundle
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity

class Calendar_p: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendar)
        val calendar = this.findViewById<CalendarView>(R.id.calendarView)
        calendar.setOnDateChangeListener(CalendarView.OnDateChangeListener { view, year, month, day ->
            val intent = Intent(this, Day_p::class.java)
            intent.putExtra(Day_p.data, "" + day + "/" + (month + 1).toString()+"/"+year)
            this.startActivity(intent)

        })
    }
}