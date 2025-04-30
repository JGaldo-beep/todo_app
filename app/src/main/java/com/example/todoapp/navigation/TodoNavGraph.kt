package com.example.todoapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.todoapp.ui.screens.detail.DetailDestination
import com.example.todoapp.ui.screens.detail.DetailScreen
import com.example.todoapp.ui.screens.edit.EditDestination
import com.example.todoapp.ui.screens.edit.EditScreen
import com.example.todoapp.ui.screens.entry.EntryDestination
import com.example.todoapp.ui.screens.entry.EntryScreen
import com.example.todoapp.ui.screens.home.HomeScreen
import com.example.todoapp.ui.screens.home.ListDestination

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
            HomeScreen(
                navigateToAddTask = {
                    navController.navigate(EntryDestination.route)
                }
            )
        }

        composable(
            route = DetailDestination.routeWithArgs,
            arguments = listOf(navArgument(DetailDestination.todoIdArg) {
                type = NavType.IntType
            })
        ) {
            DetailScreen()
        }

        composable(
            route = EntryDestination.route
        ) {
            EntryScreen(
                navigateBack = {
                    navController.popBackStack()
                },
                onNavigateUp = {
                    navController.navigateUp()
                }
            )
        }

        composable(
            route = EditDestination.routeWithArgs
        ) {
            EditScreen()
        }
    }
}