package na.severinchik.composestyling.ui.resources

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import na.severinchik.composestyling.R

@Composable
fun DefaultAndroidResourcesSample() {
    Text(
        text = stringResource(R.string.compose),
        modifier = Modifier
            .padding(top = dimensionResource(id = R.dimen.dp20))
            .background(color = colorResource(id = R.color.black))
    )

    Icon(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "Icon"
    )

}