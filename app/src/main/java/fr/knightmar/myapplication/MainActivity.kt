package fr.knightmar.myapplication

import IncomingCall
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.knightmar.myapplication.ui.theme.pages.DaughterCall
import fr.knightmar.myapplication.ui.theme.pages.Home


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Main()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Main() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "incomingCall") {
        composable("incomingCall") { IncomingCall(navController) }
        composable("daughterCall") { DaughterCall(navController) }
        composable("home") { Home(navController) }
    }
}
