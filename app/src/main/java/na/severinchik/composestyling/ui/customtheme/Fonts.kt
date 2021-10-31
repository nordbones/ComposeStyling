package na.severinchik.composestyling.ui.customtheme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import na.severinchik.composestyling.R

private val Syne = FontFamily(
    Font(R.font.syne_regular, FontWeight.W400),
    Font(R.font.syne_medium, FontWeight.W500),
    Font(R.font.syne_semi_bold, FontWeight.W600),
    Font(R.font.syne_bold, FontWeight.W700),
    Font(R.font.syne_extra_bold, FontWeight.W800),
)

data class Fonts(
    val color: Color,
    val syneW400: TextStyle = TextStyle(
        fontFamily = Syne,
        color = color,
        fontWeight = FontWeight.W400
    ),
    val syneW500: TextStyle = TextStyle(
        fontFamily = Syne,
        color = color,
        fontWeight = FontWeight.W500
    ),
    val syneW600: TextStyle = TextStyle(
        fontFamily = Syne,
        color = color,
        fontWeight = FontWeight.W600
    ),
    val syneW700: TextStyle = TextStyle(
        fontFamily = Syne,
        color = color,
        fontWeight = FontWeight.W700
    ),
    val syneW800: TextStyle = TextStyle(
        fontFamily = Syne,
        color = color,
        fontWeight = FontWeight.W800
    )
)


val LocalCustomThemeFonts =
    androidx.compose.runtime.staticCompositionLocalOf<Fonts> {
        error("No fonts provided")
    }
