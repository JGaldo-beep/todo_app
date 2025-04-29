package com.example.todoapp.ui.screens.edit

import androidx.compose.runtime.Composable
import com.example.todoapp.R
import com.example.todoapp.navigation.NavigationDestination

object EditDestination : NavigationDestination {
    override val route = "todo_details"
    override val titleRes = R.string.edit_todo
    const val todoIdArg = "todoId"
    val routeWithArgs = "$route/{$todoIdArg}"
}

@Composable
fun EditScreen() {

}