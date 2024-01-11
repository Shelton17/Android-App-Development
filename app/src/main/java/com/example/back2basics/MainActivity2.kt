package com.example.back2basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.back2basics.databinding.ActivityMain2Binding
import com.example.back2basics.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnAdd.setOnClickListener{
            val firstNumber = binding.etFirstNumber.text.toString()
            val secondNumber = binding.etSecondNumber.text.toString()
            var result = firstNumber + secondNumber

            binding.tvResult.text = result.toString()
        }
    }
}