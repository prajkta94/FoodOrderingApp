package com.example.foodorderingapp.Activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodorderingapp.R
import com.example.foodorderingapp.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {

    private val binding : ActivityStartBinding by lazy {
        ActivityStartBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

binding.btnNext.setOnClickListener(View.OnClickListener {

    val intent = Intent(this,LoingActivity::class.java)
    startActivity(intent)
})

    }
}