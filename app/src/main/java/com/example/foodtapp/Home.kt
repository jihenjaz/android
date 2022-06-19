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
    val data = ArrayList<HomeModel>()
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
        recyclerview.apply {

            layoutManager = LinearLayoutManager(activity)
            adapter =HomeHorAdapter()
        }
    }
}
