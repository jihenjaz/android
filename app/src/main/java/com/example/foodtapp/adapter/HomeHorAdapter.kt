package com.example.foodtapp.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtapp.R
import com.example.foodtapp.models.HomeModel

class HomeHorAdapter(private val mList: List<HomeModel>) : RecyclerView.Adapter<HomeHorAdapter.ViewHolder>() {
    private val text = arrayOf("Patisserie", "Restaurant", "Supermarché", "Marchand", "Epicerie")
    private val image = intArrayOf(
        R.drawable.ic_pat,
        R.drawable.ic_res,
        R.drawable.ic_sup,
        R.drawable.ic_fg,
        R.drawable.ic_ep
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.home_horizontal_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val homeModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(homeModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = homeModel.text

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}

