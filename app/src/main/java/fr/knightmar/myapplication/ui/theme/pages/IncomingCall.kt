import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import fr.knightmar.myapplication.R

@Composable
fun IncomingCall(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dp(20F)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(Dp(10F))) {
            Button(
                onClick = { }, colors = ButtonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Black,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Black
                )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.accept_call),
                    contentDescription = "test"
                )
                Text("Refuser l'appel")
            }
            Button(
                onClick = { navController.navigate("daughterCall") }, colors = ButtonColors(
                    containerColor = Color.Green,
                    contentColor = Color.Black,
                    disabledContainerColor = Color.Gray,
                    disabledContentColor = Color.Black
                )
            ) {
                Text("Accepter l'appel")
            }
        }

    }
}
