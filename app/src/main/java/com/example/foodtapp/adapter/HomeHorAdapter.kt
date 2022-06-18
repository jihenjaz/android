package com.example.foodtapp.adapter

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtapp.R


class HomeHorAdapter  : RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {
    private var names = arrayOf("Patisserie","Restaurant","Supermarché","Marchand","Epicerie")
    private var images = intArrayOf(R.drawable.ic_pat,R.drawable.ic_res,R.drawable.ic_sup,R.drawable.ic_fg,R.drawable.ic_ep)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHorAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.home_horizontal_item,parent,false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(holder: HomeHorAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.name.text=names[position]
        holder.imageView.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return names.size
    }
    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var imageView : ImageView
        var name : TextView

        init {
            imageView = itemView.findViewById(R.id.hor_img)
            name = itemView.findViewById(R.id.hor_text)
        }

    }
}

