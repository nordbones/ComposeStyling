package na.severinchik.composestyling.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import na.severinchik.composestyling.ui.theme.ComposeStylingTheme

@Composable
fun DefaultMaterialThemeSample() {

    var themeState by remember { mutableStateOf(false) }

    ComposeStylingTheme(darkTheme = themeState) {

        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            Box(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .align(Alignment.TopCenter)
                        .size(64.dp)
                        .background(MaterialTheme.colors.secondary)
                ) {

                }
                Button(
                    modifier = Modifier.align(Alignment.BottomCenter),
                    onClick = { themeState = !themeState }) {
                    Text(text = "Theme toggle")
                }
            }
        }
    }
}