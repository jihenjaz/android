package com.example.foodtapp.Activities

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.example.foodtapp.MainActivity
import com.example.foodtapp.R
import kotlinx.android.synthetic.main.activity_login.*

@Suppress("UNREACHABLE_CODE")
class Login : AppCompatActivity() {
    val dropDownList = arrayOf("User","trader")
    @RequiresApi(Build.VERSION_CODES.M)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        signUp.setOnClickListener {
            signUp.background=resources.getDrawable(R.drawable.switch_trcks,null)
            signUp.setTextColor(resources.getColor(R.color.textColor,null))
            logIn.background= null
            signUplayout.visibility = View.VISIBLE
            logInlayout.visibility= View.GONE
            logIn.setTextColor(resources.getColor(R.color.pinkColor,null))
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,dropDownList)
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            Role.adapter= adapter
            Role.onItemSelectedListener= object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(parent: AdapterView<*>?) {
                }

                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    if(Role.selectedItemPosition==0){
                        condition1()

                    }
                    if(Role.selectedItemPosition==1){
                        condition2()

                    }
                }
            }

        }
        logIn.setOnClickListener {
            signUp.background=null
            signUp.setTextColor(resources.getColor(R.color.pinkColor,null))
            logIn.background= resources.getDrawable(R.drawable.switch_trcks,null)
            signUplayout.visibility = View.GONE
            logInlayout.visibility= View.VISIBLE
            logIn.setTextColor(resources.getColor(R.color.textColor,null))
        }
        signIn.setOnClickListener {
            startActivity(Intent(this@Login, MainActivity::class.java))
        }

    }
    private fun condition1(){
        Toast.makeText(this, "User"+Role.selectedItem, Toast.LENGTH_SHORT).show()

    }
    private fun condition2(){
        Toast.makeText(this, "trader"+Role.selectedItem, Toast.LENGTH_SHORT).show()

    }
}

