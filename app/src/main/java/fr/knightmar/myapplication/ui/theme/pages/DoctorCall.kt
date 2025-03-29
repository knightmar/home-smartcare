package fr.knightmar.myapplication.ui.theme.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import fr.knightmar.myapplication.R
import fr.knightmar.myapplication.ui.theme.utils.VideoPlayer

@Composable
fun DoctorCall(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        VideoPlayer(
            context = LocalContext.current,
            videoResId = R.raw.call_daughter
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.call_ui_daughter),
                contentDescription = "Incoming Call",
                Modifier.size(height = 700.dp, width = 400.dp)
                // CHnage size
            )

            Button(onClick = { navController.navigate("homeScreen") },
                modifier = Modifier.padding(bottom = 25.dp).width(210.dp).height(50.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFDB5910))
            ) {
                Text("Raccrocher", fontSize = 25.sp,) //, modifier = Modifier.padding(top = 40.dp))
            }
        }
    }
}