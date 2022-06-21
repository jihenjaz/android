package com.example.foodtapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtapp.adapter.HomeHorAdapter
import com.example.foodtapp.adapter.HomeVerAdapter
import com.example.foodtapp.models.HomeModel
import com.example.foodtapp.models.HomeVModel
import kotlinx.android.synthetic.main.fragment_home.*


class Home : Fragment() {
    var mList = ArrayList<HomeModel>()
    var homeHorAdapter = HomeHorAdapter()
    var mvList = ArrayList<HomeVModel>()
    var homeVerAdapter = HomeVerAdapter()

    private val text = arrayOf("Patisserie", "Restaurant", "Superette", "Marchand", "Epicerie")
    private val image = intArrayOf(
        R.drawable.ic_pat,
        R.drawable.ic_res,
        R.drawable.ic_sup,
        R.drawable.ic_fg,
        R.drawable.ic_ep

    )
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<HomeHorAdapter.ViewHolder>? = null
    private var adapter1: RecyclerView.Adapter<HomeVerAdapter.ViewHolder>? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        mList.add(HomeModel(R.drawable.ic_pat,"Patisserie"))
        mList.add(HomeModel(R.drawable.ic_res,"restaurant"))
        mList.add(HomeModel(R.drawable.ic_sup,"Superette"))
        mList.add(HomeModel(R.drawable.ic_fg,"Marchand"))
        mList.add(HomeModel(R.drawable.ic_ep,"Epicerie"))
        homeHorAdapter.setData(mList)
        recycler_view.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        recycler_view.adapter=homeHorAdapter
        mvList.add(HomeVModel(R.drawable.pic3,"humberger","Today 14:00-16:00","4.2","4Dt"))
        mvList.add(HomeVModel(R.drawable.pic2,"Mini Tacos","Today 12:00-14:30","5.0","2,5Dt"))
        mvList.add(HomeVModel(R.drawable.pic1," Pasta","Today 12:00-14:30","5.0","8,5Dt"))

        homeVerAdapter.setData(mvList)
        recycler_view1.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        recycler_view1.adapter=homeVerAdapter

    }
}
