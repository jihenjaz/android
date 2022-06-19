package com.example.foodtapp.Activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.foodtapp.MainActivity
import com.example.foodtapp.R
import com.example.foodtapp.databinding.ActivityRegistationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val Role = listOf("Trader", "User")
        val adapter = ArrayAdapter(this , R.layout.dropdown_item,Role)
        binding.Role.setAdapter(adapter)
    }

    fun register(view: View) {
        startActivity(Intent(this@RegistrationActivity, LoginActivity::class.java))
    }

    fun mainActivity(view: View) {
        startActivity(Intent(this@RegistrationActivity, MainActivity::class.java))
    }
}