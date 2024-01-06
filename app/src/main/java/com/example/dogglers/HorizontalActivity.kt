package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.ItemAdapter
import com.example.dogglers.data.DataSource

class HorizontalActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horizontal_layout)
        val dogDetails = DataSource().info()
        val view = findViewById<RecyclerView>(R.id.hor_recycle)
        view.adapter = ItemAdapter(this, dogDetails)
    }
}