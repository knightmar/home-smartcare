package fr.knightmar.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fr.knightmar.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    JustDance(
                        modifier = Modifier.padding(innerPadding).padding(10.dp)
                    )
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
                Image(
                    painter = painterResource(id = R.)
                )
                Text("Bouton 1")
            }
            Button(
                onClick = { /* Action bouton 2 */ },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                shape = RectangleShape
            ) {
                Text("Bouton 2")
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
                Text("Bouton 3")
            }
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Test")
    }
}