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
        val firstName = intent.getStringExtra("EXTRA_FIRST_NAME")
        val lastName = intent.getStringExtra("EXTRA_LAST_NAME")
        val birthDate = intent.getStringExtra("EXTRA_BIRTH_DATE")
        val country = intent.getStringExtra("EXTRA_COUNTRY")

        var summary = "$firstName $lastName, born on $birthDate. \n Location: $country"
        binding.tvDisplay.text = summary
    }
}