package com.example.pizzarecyclerviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private var layoutManager:RecyclerView.LayoutManager? = null
    private  var adapter:RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        adapter = RecyclerViewAdapter()
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

    }
}