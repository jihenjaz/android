package com.example.foodtapp.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodtapp.R
import com.example.foodtapp.adapter.HomeHorAdapter
import com.example.foodtapp.models.HomeModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeActivity : AppCompatActivity() {
    var mList = ArrayList<HomeModel>()
    var homeHorAdapter = HomeHorAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        mList.add(HomeModel(R.drawable.ic_pat,"Patisserie"))
        mList.add(HomeModel(R.drawable.ic_res,"restaurant"))
        mList.add(HomeModel(R.drawable.ic_sup,"Supermarché"))
        mList.add(HomeModel(R.drawable.ic_fg,"Marchand"))
        mList.add(HomeModel(R.drawable.ic_ep,"Epicerie"))
        homeHorAdapter.setData(mList)
        recycler_view.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        recycler_view.adapter=homeHorAdapter
        }
    }
