package com.example.todoapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.todoapp.data.repository.TodoRepository

class EditViewModel(
    private val todoRepository: TodoRepository
) : ViewModel() {
}