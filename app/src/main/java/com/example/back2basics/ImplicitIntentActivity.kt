package com.example.back2basics

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.back2basics.databinding.ActivityImplicitIntentBinding

class ImplicitIntentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImplicitIntentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnChoosePhoto.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {

                it.type = "image/*"
                startActivityForResult(it, 0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 0){
            val uri = data?.data
            binding.ivPhoto.setImageURI(uri)
        }
    }

}