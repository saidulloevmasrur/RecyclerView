package com.example.pizzarecyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerViewAdapter:RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private var title = arrayOf("Title1","Title2","Title3","Title4","Title5","Title6","Title7","Title8","Title9","Title10")
    private var descriptor = arrayOf("Des1","Des2","Des3","Des4","Des5","Des6","Des7","Des8","Des9","Des10")
    private var images = intArrayOf(
        R.drawable.pizza_1,R.drawable.pizza_2,
        R.drawable.pizza_3,R.drawable.pizza_4,
        R.drawable.pizza_5,R.drawable.pizza_6,
        R.drawable.pizza_7,R.drawable.pizza_8,
        R.drawable.pizza_9,R.drawable.pizza_10)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        holder.itemImage.setImageResource(images[position])
        holder.itemTitle.text = title[position]
        holder.itemDescriptor.text = descriptor[position]
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView = itemView.findViewById(R.id.pizzaImageView)
        var itemTitle: TextView = itemView.findViewById(R.id.titleTextView)
        var itemDescriptor: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

}