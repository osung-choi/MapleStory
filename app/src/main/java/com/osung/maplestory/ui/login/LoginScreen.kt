package com.osung.maplestory.ui.login

import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.osung.maplestory.R
import com.osung.maplestory.ui.design.InputField

@Composable
fun LoginScreen() {

    Surface {
        InputField(
            text = stringResource(id = R.string.default_api_key),
            hint = stringResource(id = R.string.input_api_key),
            onValueChange = {

            }
        )
    }
}