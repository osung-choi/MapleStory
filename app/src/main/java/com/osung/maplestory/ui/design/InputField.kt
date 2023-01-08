package com.osung.maplestory.ui.design

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.border
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.osung.maplestory.ui.design.theme.MapleStoryTheme
import com.osung.maplestory.ui.design.theme.content300

@Composable
fun InputField(
    modifier: Modifier = Modifier,
    text: String = "",
    hint: String = "",
    onValueChange: (String) -> Unit
) {
    TextField(
        value = text,
        modifier = modifier.border(
            width = 2.dp,
            shape = MaterialTheme.shapes.medium,
            color = MaterialTheme.colors.primary
        ),
        singleLine = true,
        onValueChange = onValueChange,
        placeholder = {
            Text(text = hint)
        }
    )
}

@Composable
fun HintText(
    hint: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = hint,
        color = content300
    )
}

@Preview(showBackground = true)
@Composable
fun InputFieldPreview() {
    MapleStoryTheme {
        Surface {
            InputField(
                text = "",
                hint = "발급받은 API Key를 입력하세요",
                onValueChange = {}
            )
        }
    }
}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
fun InputFieldDarkPreview() {
    MapleStoryTheme {
        Surface {
            InputField(
                text = "API KEY",
                hint = "발급받은 API Key를 입력하세요",
                onValueChange = {}
            )
        }
    }
}