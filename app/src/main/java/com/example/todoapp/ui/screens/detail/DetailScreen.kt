package com.example.todoapp.ui.screens.detail

import androidx.compose.runtime.Composable
import com.example.todoapp.navigation.NavigationDestination
import com.example.todoapp.R
import com.example.todoapp.ui.screens.edit.EditDestination

object DetailDestination : NavigationDestination {
    override val route = "todo_details"
    override val titleRes = R.string.task_detail_title
    const val todoIdArg = "todoId"
    val routeWithArgs = "${EditDestination.route}/{$todoIdArg}"
}

@Composable
fun DetailScreen() {

}