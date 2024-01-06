package com.example.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.adapter.ItemAdapter
import com.example.dogglers.data.DataSource

class GridActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.grid_layout)
        val dogDetails = DataSource().info()
        val view = findViewById<RecyclerView>(R.id.gir_recycle)
        view.adapter = ItemAdapter(this, dogDetails)
    }
}