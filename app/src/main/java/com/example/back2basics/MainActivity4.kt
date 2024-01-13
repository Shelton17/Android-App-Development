package com.example.back2basics

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import com.example.back2basics.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnOrder.setOnClickListener {
            val checkVeggieRadioButtonId = binding.rgVeggies.checkedRadioButtonId
            val veggie = findViewById<RadioButton>(checkVeggieRadioButtonId)
            val cheese = binding.cbCheese.isChecked
            val onions = binding.cbOnions.isChecked
            val salad = binding.cbSalad.isChecked
            val orderString = "You ordered a burger with: \n" +
                    "${veggie.text}" +
                    (if (cheese) "\nCheese" else "")+
                    (if (onions) "\nOnions" else "")+
                    (if (salad) "\nSalad" else "")
            binding.tvOrder.text = orderString

            Toast.makeText(this, "Order successful!", Toast.LENGTH_SHORT).show()



    }

}
}
