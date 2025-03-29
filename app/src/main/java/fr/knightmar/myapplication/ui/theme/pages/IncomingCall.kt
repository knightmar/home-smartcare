import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import fr.knightmar.myapplication.R

@Composable
fun IncomingCall(navController: NavController) {
    Image(
        painter = painterResource(id = R.drawable.incoming_call),
        contentDescription = "Incoming Call",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier.fillMaxSize()
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Button(
                onClick = {

                },
                colors = ButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    disabledContentColor = Color.Transparent
                ),
                modifier = Modifier.size(185.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.deny_call),
                    contentDescription = "Deny Call",
                    modifier = Modifier.fillMaxSize()
                )
            }
            Button(
                onClick = { navController.navigate("daughterCall") },
                colors = ButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Transparent,
                    disabledContainerColor = Color.Transparent,
                    disabledContentColor = Color.Transparent
                ),
                modifier = Modifier.size(200.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.accept_call),
                    contentDescription = "Accept Call",
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}