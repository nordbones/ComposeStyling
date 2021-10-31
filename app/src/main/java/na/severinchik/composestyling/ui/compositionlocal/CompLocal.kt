package na.severinchik.composestyling.ui.compositionlocal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val LocalChort = compositionLocalOf<String> { error("Chort not provided") }

@Composable
fun CompositioLocalSample() {
    var someValue = "Chertila"
    CompositionLocalProvider(LocalChort provides someValue) {
        Column() {
            SomeComposable()
            Spacer(modifier = Modifier.height(42.dp))
            Button(onClick = { someValue = "Maybe Devil?" }) {
                Text(text = "Change someValue")
            }
        }
    }
}


@Composable
fun SomeComposable() {
    val localChort = LocalChort.current
    Text(text = localChort)
}

@Preview
@Composable
fun CompositioLocalSample_Provide() {

    CompositioLocalSample()
}