package na.severinchik.composestyling.ui.customtheme

import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

data class Colors(
    val isDarkTheme: Boolean,
    val persianIndigo: Color = Color(0xFF210B57),
    val white_240: Color = Color(0xF2FFFFFF),
    val gainsboro: Color = Color(0xFFE0E0E0),
    val shadyLady: Color = Color(0xFF979797),
    val alto: Color = Color(0xFFDADADA),
    val dimGray: Color = Color(0xFF636363),
    val whiteSmoke: Color = Color(0xFFF3F3F3),
    val neonBlue_0: Color = Color(0x00184BFF),
    val bilobaFlower_50: Color = Color(0X33B4A6D6),
    val lavenderBlue_255: Color = Color(0xFFD9D6FD),
    val lavenderBlue_75: Color = Color(0x4AD9D6FD),
    val razzleDazzleRose: Color = Color(0x99FF29C3),
    val blueRibbon_0: Color = Color(0x00174AFF),
    val white: Color = Color.White,
    val transparent: Color = Color.Transparent,
    val casablanca: Color = Color(0xFFF9BB43),
    val vermilion: Color = Color(0xFFFF3D00),
    val atomicTangerine: Color = Color(0xFFFE9960),
    val black: Color = Color.Black
)

@Composable
fun Colors.getButtonColors() = if (isDarkTheme) {
    ButtonDefaults.buttonColors(
        backgroundColor = persianIndigo,
        contentColor = Color.White
    )
} else {
    ButtonDefaults.buttonColors(
        backgroundColor = white_240,
        contentColor = persianIndigo
    )
}

val LocalCustomThemeColors =
    androidx.compose.runtime.staticCompositionLocalOf<Colors> {
        error("No colors provided")
    }