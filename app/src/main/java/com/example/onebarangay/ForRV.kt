package com.example.onebarangay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_dashboard.*

class ForRV : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_rv)

        val dataSet : Array<String> = arrayOf("Lorem", "Ipsum", "Dolor", "Sit", "Amet")

        val adapter = ItemAdapter(dataSet)
        announcementRV.layoutManager = LinearLayoutManager(this)
        announcementRV.adapter = adapter
    }
}