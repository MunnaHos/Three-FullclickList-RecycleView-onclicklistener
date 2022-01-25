package com.example.fullclicklist

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.media.Image
import android.util.Log
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val lst:List<DataList>,val onclickListener: OnclickListener):RecyclerView.Adapter<Adapter.foodViewHolder>() {

    class foodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var imageSrc = itemView.findViewById<ImageView>(R.id.image)
        val name= itemView.findViewById<TextView>(R.id.txt_one)
        val price= itemView.findViewById<TextView>(R.id.txt_two)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): foodViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.layout_list_item,parent,false)
        return foodViewHolder(v)
    }

    override fun onBindViewHolder(holder: foodViewHolder, position: Int) {

        holder.name.text= list[position].txt
        holder.price.text= list[position].price

        holder.itemView.setOnClickListener {
            onclickListener.imageClick(position)
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }
}