package com.example.back2basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.back2basics.databinding.ActivityMain5Binding
import com.example.back2basics.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    private lateinit var binding: ActivityMain6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person


        binding.tvDisplay.text = person.toString()
    }
}