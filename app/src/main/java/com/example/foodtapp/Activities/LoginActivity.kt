package com.example.foodtapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.foodtapp.MainActivity
import com.example.foodtapp.R
import com.example.foodtapp.databinding.ActivityLogin2Binding
import com.example.foodtapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogin2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        }
    }

    fun register(view: View) {
        startActivity(Intent(this@LoginActivity, RegistrationActivity::class.java))
    }
}