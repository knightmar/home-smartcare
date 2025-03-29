package fr.knightmar.myapplication.ui.theme.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import fr.knightmar.myapplication.R
import fr.knightmar.myapplication.ui.theme.utils.CustomDialog
import fr.knightmar.myapplication.ui.theme.utils.VideoPlayer

@Composable
fun DaughterCall(navController: NavController) {
    val fontFamily = FontFamily(Font(R.font.luciole_regular))


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
                contentDescription = "Incoming Call"
            )
        }
        var showDialog by remember { mutableStateOf(false) }

        CustomDialog(
            showDialog = showDialog,
            onDismiss = { showDialog = false },
            navController = navController
        )
        Button(onClick = {
            showDialog = true
        }) {
            Text("Racrocher", fontFamily = fontFamily) //, modifier = Modifier.padding(top = 40.dp))
        }
    }
}
