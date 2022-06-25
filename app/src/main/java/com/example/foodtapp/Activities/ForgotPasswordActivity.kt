package com.example.foodtapp.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.foodtapp.R

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var etEmail: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        viewInitializations()
    }
    fun viewInitializations() {

        etEmail = findViewById(R.id.et_email)

        // To show back button in actionbar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    fun validateInput(): Boolean {

        if (etEmail.text.toString().equals("")) {
            etEmail.setError("Please Enter Email")
            return false
        }
        // checking the proper email format
        if (!isEmailValid(etEmail.text.toString())) {
            etEmail.setError("Please Enter Valid Email")
            return false
        }
        return true
    }

    fun isEmailValid(email: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun performForgetPassword (view: View) {
        if (validateInput()) {

            // Input is valid, here send data to your server


            val email = etEmail.text.toString()

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

            Toast.makeText(this,"Email send to Register Email Address", Toast.LENGTH_SHORT).show()


            // Here you can call you API

        }
    }

    fun goToLogin(view: View) {}


}
