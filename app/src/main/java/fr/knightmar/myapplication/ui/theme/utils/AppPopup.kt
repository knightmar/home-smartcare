package fr.knightmar.myapplication.ui.theme.utils

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.navigation.NavController


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
    if (showDialog) {
        val context = LocalContext.current // Capture context outside lambda

        AlertDialog(
            title = { Text(text = "Title") },
            text = { Text(text = "This is a test dialog.") },
            onDismissRequest = { },
            confirmButton = {
                TextButton(
                    onClick = {
                        onDismiss()
                        Toast.makeText(context, "Test", Toast.LENGTH_SHORT).show()
                        navController.navigate("justDance")
                    }
                ) {
                    Text("Confirmer")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = onDismiss
                ) {
                    Text("Annuler")
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