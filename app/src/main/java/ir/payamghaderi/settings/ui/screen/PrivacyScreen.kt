package ir.payamghaderi.settings.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
    fun PrivacyScreen(){

        Column (modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center
            ){

            Text(
                text = "PrivacyScreen", fontSize = 28.sp
            )
            Spacer(modifier = Modifier.height(24.dp))

        }
    }
