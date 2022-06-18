package com.example.foodtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
    }

    fun register(view: View) {
        startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
    }
}