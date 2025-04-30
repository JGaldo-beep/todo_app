package com.example.todoapp.ui

import android.app.Application
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.todoapp.TodoApplication
import com.example.todoapp.ui.screens.detail.DetailViewModel
import com.example.todoapp.ui.screens.edit.EditViewModel
import com.example.todoapp.ui.screens.entry.EntryViewModel
import com.example.todoapp.ui.screens.home.HomeViewModel

/**
 * Provides Factory to create instance of ViewModel for the entire app
 */
object AppViewModelProvider {
    val Factory = viewModelFactory {
        // Initializer for DetailViewModel
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                todoApplication().container.todoRepository
            )
        }

        // Initializer for EditViewModel
        initializer {
            EditViewModel(
                this.createSavedStateHandle(),
                todoApplication().container.todoRepository
            )
        }

        // Initializer for EntryViewModel
        initializer {
            EntryViewModel(
                todoApplication().container.todoRepository
            )
        }

        // Initializer for HomeViewModel
        initializer {
            HomeViewModel(
                todoApplication().container.todoRepository
            )
        }
    }
}

/**
 * Extension function to queries for [Application] object and returns an instance of
 * [TodoApplication].
 */
fun CreationExtras.todoApplication(): TodoApplication =
    (this[AndroidViewModelFactory.APPLICATION_KEY] as TodoApplication)