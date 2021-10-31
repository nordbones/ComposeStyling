package na.severinchik.composestyling.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import na.severinchik.composestyling.ui.customtheme.CustomTheme
import na.severinchik.composestyling.ui.customtheme.getButtonColors

@Composable
fun CustomThemeSample() {
    var themeColorState by remember { mutableStateOf(false) }
    var themeSizeState by remember { mutableStateOf(false) }
    CustomTheme(darkTheme = themeColorState, smallScreen = themeSizeState) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(CustomTheme.colors.lavenderBlue_255)
                .padding(CustomTheme.dimens.small)
        ) {
            Text(
                text = "Bears rode a bike, And the devil took an electric scooter at the rental",
                style = CustomTheme.fonts.syneW600
            )

            Button(
                onClick = {
                    themeColorState = !themeColorState
                    themeSizeState = !themeSizeState
                },
                modifier = Modifier.padding(top = CustomTheme.dimens.large),
                colors = CustomTheme.colors.getButtonColors()
            ) {
                Text(text = "Change theme state"/*,style = CustomTheme.fonts.syneW500*/)
            }
        }
    }
}

@Preview
@Composable
fun CustomTheme_Sample() {
    CustomThemeSample()
}