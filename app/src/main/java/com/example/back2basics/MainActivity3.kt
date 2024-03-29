package com.example.back2basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.back2basics.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnAddImage.setOnClickListener{
            binding.ivImage.setImageResource(R.drawable.sarah1)
        }
    }
}