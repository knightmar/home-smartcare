package fr.knightmar.myapplication

import IncomingCall
import android.content.Context
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
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fr.knightmar.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    Surface(modifier = Modifier.fillMaxSize()) {
        HomeScreen()
    }
}

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val colors = listOf(Color(0xFFD3F8E2), Color(0xFFE4C1F9), Color(0xFFEDCFB3), Color(0xFFF694C1), Color(0xFFF4F7BE), Color(0xFFA9DEF9))
        val logos = listOf(R.drawable.logo_calendrier, R.drawable.logo_multimedia, R.drawable.logo_contact, R.drawable.logo_urgence, R.drawable.logo_med_store, R.drawable.logo_suivi_med)
        val text_buttons = listOf("Calendrier", "Multimédia", "Contacts", "Urgence", "Med Store", "Suivi Med")
        var index = 0

        val fontFamily = FontFamily(Font(R.font.luciole_regular))


        for (rowIndex in 0 until 2) { // 3 columns
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (columnIndex in 0 until 3) { // 2 rows
                    Button(
                        onClick = { /* TODO */ },
                        modifier = Modifier
                            .padding(8.dp)
                            .weight(1f)
                            .height(350.dp),
                        shape = RectangleShape,
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colors[index],
                            contentColor = Color.Black,
                            disabledContainerColor = colors[index],
                            disabledContentColor = Color.Black
                        )
                    ) {

                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Image(
                                painter = painterResource(id = logos[index]),
                                contentDescription = "Button image",
                                modifier = Modifier.size(200.dp)
                            )

                            Text(text = text_buttons[index],
                                fontSize = 50.sp,
                                modifier = Modifier.padding(top = 40.dp),
                                fontFamily = fontFamily)
                        }

                    }

                    index++;
                }
            }
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
