package com.example.foodtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}