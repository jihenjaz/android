package com.example.foodtapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.example.foodtapp.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_welcome)
    }

    fun register(view: View?) {
        startActivity(Intent(this@WelcomeActivity, RegistrationActivity::class.java))
    }

    fun Login(view: View) {
        startActivity(Intent(this@WelcomeActivity, RegistrationActivity::class.java))
    }
}