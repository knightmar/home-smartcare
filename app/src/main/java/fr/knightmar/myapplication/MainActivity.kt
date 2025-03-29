package fr.knightmar.myapplication

import IncomingCall
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import fr.knightmar.myapplication.ui.theme.MyApplicationTheme
import fr.knightmar.myapplication.ui.theme.pages.DaughterCall
import fr.knightmar.myapplication.ui.theme.pages.Home


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JustDance(
                        modifier = Modifier.padding(innerPadding).padding(10.dp)
                    )
                    //MyApp()
                }
            }
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

@Composable
fun JustDance(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize() // Remplit tout l'écran
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp) // Espacement entre les éléments
    ) {
        Spacer(modifier = Modifier.height(16.dp)) // Espace avant les boutons

        Row(
            modifier = Modifier.weight(1f), // Fait en sorte que les boutons prennent toute la hauteur dispo
            horizontalArrangement = Arrangement.spacedBy(8.dp) // Espace entre les boutons
        ) {
            Button(
                onClick = { /* Action bouton 1 */ },
                modifier = Modifier
                    .weight(1f) // Chaque bouton prend 1/3 de la largeur
                    .fillMaxHeight(), // Chaque bouton prend toute la hauteur
                shape = RectangleShape,
                colors = ButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black,
                    disabledContainerColor = Color.Cyan,
                    disabledContentColor = Color.White
                )

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fleche_gauche_black_raisin),
                        contentDescription = "Bouton aller à gauche",
                        modifier = Modifier.size(250.dp)
                    )
                    Text("Précédent",
                        fontSize = 40.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center)
                }
            }
            Button(
                onClick = { /* Action bouton 2 */ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                shape = RectangleShape,
                colors = ButtonColors(
                    containerColor = Color(0xFFABDDF8),
                    contentColor = Color.Black,
                    disabledContainerColor = Color.Cyan,
                    disabledContentColor = Color.White
            )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_cardiologue),
                        contentDescription = "LogoAppliCardiologue",
                        modifier = Modifier.size(400.dp)
                    )
                    Text("Application",
                        fontSize = 50.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center)
                    Text("Cardiologue",
                        fontSize = 50.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center)
                }
            }
            Button(
                onClick = { /* Action bouton 3 */ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                shape = RectangleShape,
                colors = ButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black,
                    disabledContainerColor = Color.Cyan,
                    disabledContentColor = Color.White
            )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.fleche_droite_black_raisin),
                        contentDescription = "Bouton aller à gauche",
                        modifier = Modifier.size(250.dp)
                    )
                    Text("Suivant",
                        fontSize = 40.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center)
                }
            }
        }
        Button(
            onClick = { /* Action du bouton en bas */ },
            modifier = Modifier
                .fillMaxWidth() // Occupe toute la largeur
                .height(80.dp) // Augmente la hauteur du bouton
                .align(Alignment.CenterHorizontally), // Centre le bouton horizontalement
            shape = RectangleShape, // Bords arrondis
            colors = ButtonColors(
                containerColor = Color(0xFF282828), // Vert pour bien le distinguer
                contentColor = Color.White,
                disabledContainerColor = Color.Cyan,
                disabledContentColor = Color.White
            )
        ) {
            Text(
                "Retour à l'Accueil",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, modifierDeux: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Main() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "incomingCall") {
        composable("incomingCall") { IncomingCall(navController) }
        composable("daughterCall") { DaughterCall(navController) }
        composable("home") { Home(navController) }
    }
}
