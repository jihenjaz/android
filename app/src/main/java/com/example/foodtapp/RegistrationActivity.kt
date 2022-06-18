package com.example.foodtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registation)
    }

    fun register(view: View) {
        startActivity(Intent(this@RegistrationActivity, LoginActivity::class.java))
    }
}