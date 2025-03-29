package fr.knightmar.myapplication.ui.theme.utils

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import fr.knightmar.myapplication.R


//Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//    Column(
//        modifier = Modifier
//            .padding(innerPadding)
//            .fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center,
//
//        ) {
//        // Ajouter un bouton pour afficher le Dialog
//        Button(onClick = { showDialog = true }) {
//            Text("Ouvrir la pop-up")
//        }
//
//        // Intégrer le CustomDialog
//        fr.knightmar.myapplication.CustomDialog(
//            showDialog = showDialog,
//            onDismiss = { showDialog = false })
//    }
//}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDialog(navController: NavController, showDialog: Boolean, onDismiss: () -> Unit) {

    val fontFamily = FontFamily(Font(R.font.luciole_regular))
    val fontFamilyBold = FontFamily(Font(R.font.luciole_bold))

    if (showDialog) {
        val context = LocalContext.current // Capture context outside lambda

        AlertDialog(
            title = { Text(text = "Installation", fontFamily = fontFamily, fontSize = 40.sp) },
            text = { Text(text = "Votre contact Caroline a inité l'installation de l'application Cardiologie.", lineHeight = 60.sp, fontSize = 35.sp, fontFamily = fontFamily) },
            //modifier = Modifier.height(500.dp),
            onDismissRequest = { },
            confirmButton = {
                TextButton(
                    onClick = {
                        onDismiss()
                        Toast.makeText(context, "L'application Cardiologie a été installée.", Toast.LENGTH_LONG).show()
                        navController.navigate("justDance")
                    },
                    colors = ButtonDefaults.buttonColors(Color(0xFF44c740))
                ) {
                    Text("Confirmer" , fontFamily = fontFamilyBold, color = Color.Black)
                }
            },
            dismissButton = {
                TextButton(
                    onClick = onDismiss,
                    colors = ButtonDefaults.buttonColors(Color.Red)
                ) {
                    Text("Annuler" , fontFamily = fontFamilyBold, color = Color.Black)
                }
            }
        )
    }
}

val myAnnotatedString1 = buildAnnotatedString {
    append("Texte avec un ")
    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
        append("mot en gras")
    }
    append(".")
}

val myAnnotatedString2 = buildAnnotatedString {
    append("Titre avec un ")
    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
        append("mot en gras")
    }
    append(".")
}

//@Preview(showBackground = true)
//@Composable
//fun PreviewCustomDialog() {
//    MyApplicationTheme {
//        CustomDialog(showDialog = true, onDismiss = {})
//    }
//}