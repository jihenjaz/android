package com.example.foodtapp.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtapp.R
import com.example.foodtapp.models.HomeModel
import com.example.foodtapp.models.HomeVModel
import kotlinx.android.synthetic.main.home_vertical_item.view.*

class HomeVerAdapter: RecyclerView.Adapter<HomeVerAdapter.ViewHolder>() {
    var mvList = ArrayList<HomeVModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.home_vertical_item, parent, false))
    }


    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemView

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(mvList[position].image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = mvList[position].text
        holder.timingView.text = mvList[position].timing
        holder.ratingView.text = mvList[position].rating
        holder.priceView.text = mvList[position].price

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mvList.size
    }

    // Holds the views for adding it to image and text
    inner class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ver_img)
        val textView: TextView = itemView.findViewById(R.id.text)
        val timingView: TextView = itemView.findViewById(R.id.timing)
        val ratingView: TextView = itemView.findViewById(R.id.rating)
        val priceView: TextView = itemView.findViewById(R.id.price)
    }
    fun setData(arrData : List<HomeVModel>){
        mvList = arrData as ArrayList<HomeVModel>
    }
}

