package com.example.todoapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.todoapp.data.repository.TodoRepository

class ListViewModel(
    private val todoRepository: TodoRepository
) : ViewModel() {

}