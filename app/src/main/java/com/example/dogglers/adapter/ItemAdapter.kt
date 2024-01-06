package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R
import com.example.dogglers.model.DogInfo
import javax.sql.DataSource

class ItemAdapter(val context: Context, val DataSet : List<DogInfo>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){
    class ItemViewHolder (val view : View) : RecyclerView.ViewHolder(view) {
        val dogName : TextView= view.findViewById<TextView>(R.id.animal_title)
        val dogAge : TextView= view.findViewById<TextView>(R.id.age)
        val dogImg : ImageView= view.findViewById<ImageView>(R.id.animal_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return DataSet.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
       val dog = DataSet[position]
        holder.dogName.text = context.resources.getString(dog.name)
        holder.dogAge.text = context.resources.getString(dog.age)
        holder.dogImg.setImageResource(dog.img)
    }
}