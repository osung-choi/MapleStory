package com.osung.maplestory.ui.design

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.osung.maplestory.ui.design.theme.MapleStoryTheme

@Composable
fun InputField(
    modifier: Modifier = Modifier,
    text: String = "",
    hint: String = "",
    onValueChange: (String) -> Unit
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = hint,
            fontSize = 12.sp,
            modifier = Modifier.padding(start = 2.dp, bottom = 2.dp)
        )

        TextField(
            value = text,
            modifier = Modifier
                .wrapContentHeight()
                .border(
                    width = 2.dp,
                    shape = MaterialTheme.shapes.medium,
                    color = MaterialTheme.colors.primary
                ),
            singleLine = true,
            onValueChange = onValueChange
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InputFieldPreview() {
    MapleStoryTheme {
        Surface {
            InputField(
                text = "API KEY",
                hint = "hint",
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
                hint = "hint",
                onValueChange = {}
            )
        }
    }
}