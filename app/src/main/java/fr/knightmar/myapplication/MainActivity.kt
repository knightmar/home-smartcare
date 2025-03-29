package fr.knightmar.myapplication

import IncomingCall
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.knightmar.myapplication.ui.theme.MyApplicationTheme
import fr.knightmar.myapplication.ui.theme.pages.DaughterCall
import fr.knightmar.myapplication.ui.theme.pages.HomeScreen
import fr.knightmar.myapplication.ui.theme.pages.JustDance


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Main()
            }
        }
    }
}


@Composable
fun Main() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "incomingCall") {
        composable("incomingCall") { IncomingCall(navController) }
        composable("daughterCall") { DaughterCall(navController) }
        composable("homeScreen") { HomeScreen(navController) }
        composable("justDance") {
            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                JustDance(
                    navController,
                    modifier = Modifier
                        .padding(innerPadding)
                        .padding(10.dp)
                )
            }
        }
    }
}
