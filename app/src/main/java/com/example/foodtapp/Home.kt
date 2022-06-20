package com.example.foodtapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtapp.adapter.HomeHorAdapter
import com.example.foodtapp.models.HomeModel
import kotlinx.android.synthetic.main.fragment_home.*

class Home : Fragment() {
    var mList = ArrayList<HomeModel>()
    var HomeHorAdapter = HomeHorAdapter()
    private val text = arrayOf("Patisserie", "Restaurant", "Supermarché", "Marchand", "Epicerie")
    private val image = intArrayOf(
        R.drawable.ic_pat,
        R.drawable.ic_res,
        R.drawable.ic_sup,
        R.drawable.ic_fg,
        R.drawable.ic_ep

    )
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<HomeHorAdapter.ViewHolder>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        mList.add(HomeModel(image[0],text[0]))
        mList.add(HomeModel(image[1],text[1]))
        mList.add(HomeModel(image[2],text[2]))
        mList.add(HomeModel(image[3],text[3]))
        mList.add(HomeModel(image[4],text[4]))

        HomeHorAdapter.setData(mList)
        recycler_view.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
    }
}
