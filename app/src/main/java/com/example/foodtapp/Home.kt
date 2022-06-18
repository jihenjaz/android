package com.example.foodtapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtapp.adapter.HomeHorAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class Home : Fragment() {
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<HomeHorAdapter.ViewHolder>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreate(savedInstanceState)
        var view = inflater.inflate(R.layout.fragment_home, container, false)
        layoutManager = LinearLayoutManager(requireContext())
        home_hor_rec.layoutManager = layoutManager
        val adapter = HomeHorAdapter()
        home_hor_rec.adapter = adapter
        return view


    }
}


