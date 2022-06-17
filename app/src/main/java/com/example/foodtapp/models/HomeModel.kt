package com.example.foodtapp.models

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodtapp.R

class HomeModel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_model)
        data class HomeModel(val name: String,val image: Int)

    }
}