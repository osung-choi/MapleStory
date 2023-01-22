package com.osung.maplestory.ui.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.osung.maplestory.R
import com.osung.maplestory.ui.design.InputField
import com.osung.maplestory.ui.design.SmallButton
import com.osung.maplestory.ui.design.theme.MapleStoryTheme

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    val defaultApiKey = stringResource(id = R.string.default_api_key)
    var rememberApiKey by remember { mutableStateOf(defaultApiKey) }

    Surface(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            InputField(
                text = rememberApiKey,
                hint = stringResource(id = R.string.input_api_key),
                onValueChange = {
                    rememberApiKey = it
                }
            )

            SmallButton(
                text = stringResource(id = R.string.word_select),
                modifier = Modifier.align(
                    alignment = Alignment.End
                )
            ) {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    MapleStoryTheme {
        LoginScreen()
    }
}