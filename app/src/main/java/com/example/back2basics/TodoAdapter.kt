package com.example.back2basics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter (
    var todos: List<Todo>
): RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){
    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.todo, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {

        val tvTodoTitle = holder.itemView.findViewById<TextView>(R.id.tvTodoTitle)
        val cbDone = holder.itemView.findViewById<CheckBox>(R.id.cbDone)
        tvTodoTitle.text = todos[position].title
        cbDone.isChecked = todos[position].isChecked
    }

    override fun getItemCount(): Int {
       return todos.size
    }
}
