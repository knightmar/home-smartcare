package fr.knightmar.myapplication.ui.theme.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
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
        Button(onClick = {navController.navigate("homeScreen")}){
            Text("Racrocher", modifier = Modifier.padding(top = 40.dp),)
        }
    }
}