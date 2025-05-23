package fr.knightmar.myapplication.ui.theme.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
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
import androidx.navigation.NavHostController
import fr.knightmar.myapplication.R


@Composable
fun Medical(navController: NavHostController) {
    val fontFamily = FontFamily(Font(R.font.luciole_regular))

    Column(
        modifier = Modifier
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
                    containerColor = Color(0xFFA9DEF9),
                    contentColor = Color.Black,
                    disabledContainerColor = Color.Cyan,
                    disabledContentColor = Color.White
                )

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_suivi_med),
                        contentDescription = "Bouton aller à gauche",
                        modifier = Modifier.size(350.dp).padding(30.dp)
                    )
                    Text(
                        "Données",
                        fontSize = 50.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 40.dp),
                        fontFamily = fontFamily
                    )
                    Text(
                        "Médicales",
                        fontSize = 50.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center,
                        fontFamily = fontFamily
                    )
                }
            }
            Button(
                onClick = { navController.navigate("doctorCall") },
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
                        painter = painterResource(id = R.drawable.tel_com_logo),
                        contentDescription = "LogoAppliCardiologue",
                        modifier = Modifier.size(330.dp)
                    )
                    Text(
                        "Télé-",
                        fontSize = 50.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center,
                        fontFamily = fontFamily,
                        modifier = Modifier.padding(top = 25.dp)
                    )
                    Text("consultation",
                        fontSize = 50.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center,
                        fontFamily = fontFamily
                    )
                }
            }
            Button(
                onClick = { navController.navigate("JustDance") },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(),
                shape = RectangleShape,
                colors = ButtonColors(
                    containerColor = Color((0xFFABDDF8)),
                    contentColor = Color.Black,
                    disabledContainerColor = Color.Cyan,
                    disabledContentColor = Color.White
                )
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cathalogue_application),
                        contentDescription = "Bouton aller à gauche",
                        modifier = Modifier.size(280.dp).padding(10.dp)
                    )
                    Text(
                        "Applications",
                        fontSize = 50.sp, // Augmente la taille du texte
                        fontWeight = FontWeight.Bold, // Rend le texte plus visible
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(top = 90.dp),
                        fontFamily = fontFamily
                    )
                }
            }
        }
        Button(
            onClick = { navController.navigate("homeScreen") },
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
                fontWeight = FontWeight.Bold,
                fontFamily = fontFamily
            )
        }
    }
}