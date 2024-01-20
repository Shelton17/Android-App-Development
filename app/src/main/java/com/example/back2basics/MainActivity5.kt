package com.example.back2basics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.example.back2basics.databinding.ActivityMain5Binding
import com.example.back2basics.databinding.ActivityMainBinding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var country : String = ""

        binding.spCountry.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity5,
                    "You're from ${parent?.getItemAtPosition(position).toString()}",
                    Toast.LENGTH_LONG).show()
                country = parent?.getItemAtPosition(position).toString()
            }
        }
        binding.btnApply.setOnClickListener {

            val firstName = binding.etFirstName.text.toString()
            val lastName = binding.etLastName.text.toString()
            val birthDate = binding.etBirthDate.text.toString()

            val person = Person(firstName,lastName,birthDate,country)
            Log.d("MainActivity", "$firstName $lastName, born on $birthDate, from $country just applied to the program")
            Intent(this, MainActivity6::class.java).also {
                it.putExtra("EXTRA_PERSON", person)

                startActivity(it)
            }
        }
    }
}