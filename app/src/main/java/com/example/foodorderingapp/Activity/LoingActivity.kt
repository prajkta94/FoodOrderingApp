package com.example.foodorderingapp.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodorderingapp.R
import com.example.foodorderingapp.databinding.ActivityLoingBinding

class LoingActivity : AppCompatActivity() {
    private  val binding : ActivityLoingBinding by lazy {
        ActivityLoingBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.txtCreateAccount.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,SignInActivity::class.java)
            startActivity(intent)
        })

        binding.btnLogin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        })

    }
}