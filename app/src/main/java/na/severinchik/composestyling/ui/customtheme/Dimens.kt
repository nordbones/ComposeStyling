package na.severinchik.composestyling.ui.customtheme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimens(
    val verySmall: Dp = 2.dp,
    val small: Dp = 4.dp,
    val semiMedium: Dp = 8.dp,
    val medium: Dp = 16.dp,
    val semiLarge: Dp = 32.dp,
    val large: Dp = 64.dp,
)

val LocalCustomThemeDimens = staticCompositionLocalOf<Dimens> { error("No dimens provided") }