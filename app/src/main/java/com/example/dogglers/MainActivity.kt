package com.example.dogglers

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val vert = findViewById<Button>(R.id.ver)
        vert.setOnClickListener {
            val intent = Intent(this, VerticalActivity::class.java)
            startActivity(intent)
        }
        val horz = findViewById<Button>(R.id.hor)
        horz.setOnClickListener {
            val intent = Intent(this, HorizontalActivity::class.java)
            startActivity(intent)
        }
        val gr = findViewById<Button>(R.id.gri)
        gr.setOnClickListener {
            val intent = Intent(this, GridActivity::class.java)
            startActivity(intent)
        }
    }
}