package fr.knightmar.myapplication.ui.theme.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import fr.knightmar.myapplication.R
import fr.knightmar.myapplication.ui.theme.utils.VideoPlayer

@Composable
fun HomeScreen(navHostController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        /*
        val colors = listOf(
            Color(0xFFD3F8E2),
            Color(0xFFE4C1F9),
            Color(0xFFEDCFB3),
            Color(0xFFF694C1),
            Color(0xFFF4F7BE),
            Color(0xFFA9DEF9)
        )
        val logos = listOf(
            R.drawable.logo_calendrier,
            R.drawable.logo_multimedia,
            R.drawable.logo_contact,
            R.drawable.logo_urgence,
            R.drawable.logo_med_store,
            R.drawable.logo_suivi_med
        )
        val text_buttons =
            listOf("Calendrier", "Multimédia", "Contacts", "Urgence", "Med Store", "Suivi Med")
        var index = 0
        */

        val fontFamily = FontFamily(Font(R.font.luciole_regular))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD3F8E2),
                    contentColor = Color.Black,
                    disabledContainerColor = Color(0xFFD3F8E2),
                    disabledContentColor = Color.Black
                )
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_calendrier),
                        contentDescription = "Button image",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(
                        text = "Calendrier",
                        fontSize = 50.sp,
                        modifier = Modifier.padding(top = 40.dp),
                        fontFamily = fontFamily
                    )
                }

            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
                    .height(350.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFE4C1F9),
                    contentColor = Color.Black,
                    disabledContainerColor = Color(0xFFE4C1F9),
                    disabledContentColor = Color.Black
                )
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_multimedia),
                        contentDescription = "Button image",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(
                        text = "Multimédia",
                        fontSize = 50.sp,
                        modifier = Modifier.padding(top = 40.dp),
                        fontFamily = fontFamily
                    )
                }

            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
                    .height(350.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFEDCFB3),
                    contentColor = Color.Black,
                    disabledContainerColor = Color(0xFFEDCFB3),
                    disabledContentColor = Color.Black
                )
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_contact),
                        contentDescription = "Button image",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(
                        text = "Contacts",
                        fontSize = 50.sp,
                        modifier = Modifier.padding(top = 40.dp),
                        fontFamily = fontFamily
                    )
                }

            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
                    .height(350.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF694C1),
                    contentColor = Color.Black,
                    disabledContainerColor = Color(0xFFF694C1),
                    disabledContentColor = Color.Black
                )
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_urgence),
                        contentDescription = "Button image",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(
                        text = "Urgence",
                        fontSize = 50.sp,
                        modifier = Modifier.padding(top = 40.dp),
                        fontFamily = fontFamily
                    )
                }

            }

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
                    .height(350.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFF4F7BE),
                    contentColor = Color.Black,
                    disabledContainerColor = Color(0xFFF4F7BE),
                    disabledContentColor = Color.Black
                )
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_med_store),
                        contentDescription = "Button image",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(
                        text = "Med Store",
                        fontSize = 50.sp,
                        modifier = Modifier.padding(top = 40.dp),
                        fontFamily = fontFamily
                    )
                }

            }

            Button(
                onClick = { navHostController.navigate("Medical") },
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
                    .height(350.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFA9DEF9),
                    contentColor = Color.Black,
                    disabledContainerColor = Color(0xFFA9DEF9),
                    disabledContentColor = Color.Black
                )
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.logo_mallette_medicale),
                        contentDescription = "Button image",
                        modifier = Modifier.size(200.dp)
                    )

                    Text(
                        text = "Médical",
                        fontSize = 50.sp,
                        modifier = Modifier.padding(top = 40.dp),
                        fontFamily = fontFamily
                    )
                }

            }
        }
    }
}