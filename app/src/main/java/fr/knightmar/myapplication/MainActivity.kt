package fr.knightmar.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fr.knightmar.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle





class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MyApplicationTheme {
                // Gérer l'état pour afficher la pop-up
                var showDialog by remember { mutableStateOf(false) }

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,

                    ) {
                        // Ajouter un bouton pour afficher le Dialog
                        Button(onClick = { showDialog = true }) {
                            Text("Ouvrir la pop-up")
                        }

                        // Intégrer le CustomDialog
                        CustomDialog(showDialog = showDialog, onDismiss = { showDialog = false })
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomDialog(showDialog: Boolean, onDismiss: () -> Unit) {
    if (showDialog) {
        AlertDialog(
            title = {
                Text(text = myAnnotatedString1)
            },
            text = {
                Text(text = myAnnotatedString2)
            },
            onDismissRequest = { }, // Appel correct de la fermeture du dialogue
            confirmButton = {
                TextButton(
                    onClick = {
                        onDismiss() // Fermeture du dialogue
                        println("Confirmation registered") // Log de confirmation
                    }
                ) {
                    Text("Confirmer")
                }
            },
            dismissButton = {
                TextButton(
                    onClick = onDismiss // Fermeture directe
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


@Composable
fun AlertDialogExample(onDismissRequest: () -> Unit, onConfirmation: () -> Unit, dialogTitle: String, dialogText: String, icon: Any) {

}

@Preview(showBackground = true)
@Composable
fun PreviewCustomDialog() {
    MyApplicationTheme {
        CustomDialog(showDialog = true, onDismiss = {})
    }
}