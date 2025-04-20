package com.example.foodorderingapp.Activity

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodorderingapp.R
import com.example.foodorderingapp.databinding.ActivityChooseocationBinding

class Chooseocation : AppCompatActivity() {

    private val binding :ActivityChooseocationBinding by lazy {
        ActivityChooseocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        val loaction = arrayOf("Jaipur","Maharashtra","Bangolar","Odisa","MadaeyPradesh","Karnataka")
        val adapter = ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,loaction)
        val autoCompleteText = binding.txtListLocation
        autoCompleteText.setAdapter(adapter)




    }
}