package com.example.back2basics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.back2basics.databinding.ActivityImplicitIntentBinding
import com.example.back2basics.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        var todoList = mutableListOf(
            Todo("Apply to Georgia Tech", false),
            Todo("Call Mummy", false),
            Todo("Talk to Sarah", false),
            Todo("Follow up with Sylvia", false),
            Todo("Read indistractable", false),
            Todo("Aced this!!!", false)
        )
        val adapter = TodoAdapter(todoList)

        binding.rvTodos.adapter = adapter
        binding.rvTodos.layoutManager = LinearLayoutManager(this)

        binding.btnAddTodo.setOnClickListener {
            val title = binding.etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }

    }
}