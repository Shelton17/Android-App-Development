package com.example.back2basics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.back2basics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnActivity1.setOnClickListener {
            Intent(this, MainActivity5::class.java).also {
                startActivity(it)
            }
        }
        binding.btnActivity2.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }
        binding.btnActivity3.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                startActivity(it)
            }
        }
        binding.btnActivity4.setOnClickListener {
            Intent(this, MainActivity4::class.java).also {
                startActivity(it)
            }
        }
        binding.btnImplicitIntent.setOnClickListener {
            Intent(this, ImplicitIntentActivity::class.java).also {
                startActivity(it)
            }
        }
        binding.btnRecyclerView.setOnClickListener {
            Intent(this, RecyclerViewActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}