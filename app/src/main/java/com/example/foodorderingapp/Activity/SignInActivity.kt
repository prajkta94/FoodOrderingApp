package com.example.foodorderingapp.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.foodorderingapp.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private val binding :ActivitySignInBinding by lazy {
        ActivitySignInBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
binding.txtAccountCreate.setOnClickListener(View.OnClickListener {
    val intent = Intent(this,LoingActivity::class.java)
    startActivity(intent)
})

        binding.btnSignIn.setOnClickListener(View.OnClickListener {

        })

    }
}