package na.severinchik.composestyling.ui.customtheme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.unit.dp

@Composable
fun CustomTheme(
    darkTheme: Boolean,
    smallScreen: Boolean,
    colors: Colors = Colors(darkTheme),
    content: @Composable () -> Unit
) {
    val fonts = if (darkTheme) {
        Fonts(colors.persianIndigo)
    } else {
        Fonts(colors.vermilion)
    }

    val dimens = if (smallScreen) {
        Dimens(
            verySmall = 1.dp,
            small = 2.dp,
            semiMedium = 4.dp,
            medium = 8.dp,
            semiLarge = 16.dp,
            large = 32.dp,
        )
    } else {
        Dimens()
    }

    CompositionLocalProvider(
        LocalCustomThemeFonts provides fonts,
        LocalCustomThemeDimens provides dimens,
        LocalCustomThemeColors provides colors,
        content = content
    )
}

object CustomTheme {
    val dimens: Dimens
        @Composable
        get() = LocalCustomThemeDimens.current
    val fonts: Fonts
        @Composable
        get() = LocalCustomThemeFonts.current
    val colors: Colors
        @Composable
        get() = LocalCustomThemeColors.current
}