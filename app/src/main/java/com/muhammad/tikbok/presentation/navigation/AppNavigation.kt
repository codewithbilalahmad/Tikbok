package com.muhammad.tikbok.presentation.navigation

import androidx.compose.animation.SharedTransitionLayout
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navHostController: NavHostController) {
    SharedTransitionLayout {
        NavHost(navController = navHostController, startDestination = Destinations.HomeScreen) {
            composable<Destinations.HomeScreen> {

            }
        }
    }
}