package com.example.back2basics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.back2basics.databinding.ActivityMain5Binding
import com.example.back2basics.databinding.ActivityMainBinding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnApply.setOnClickListener {
            val firstName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()
            val birthDate = binding.etBirthDate.text.toString()
            val country = binding.etCountry.text.toString()
            val person = Person(firstName,lastName,birthDate,country)
            Log.d("MainActivity", "$firstName $lastName, born on $birthDate, from $country just applied to the program")
            Intent(this, MainActivity6::class.java).also {
                it.putExtra("EXTRA_PERSON", person)

                startActivity(it)
            }
        }
    }
}