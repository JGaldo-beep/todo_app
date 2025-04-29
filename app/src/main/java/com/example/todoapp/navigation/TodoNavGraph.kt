package com.example.todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todoapp.ui.screens.edit.EditDestination
import com.example.todoapp.ui.screens.edit.EditScreen
import com.example.todoapp.ui.screens.list.ListDestination
import com.example.todoapp.ui.screens.list.ListScreen

@Composable
fun TodoNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = ListDestination.route,
        modifier = modifier
    ) {
        composable(route = ListDestination.route) {
            ListScreen()
        }

        composable(
            route = EditDestination.routeWithArgs,
            arguments = listOf(navArgument(EditDestination.todoIdArg) {
                type = NavType.IntType
            })
        ) {
            EditScreen()
        }
    }
}