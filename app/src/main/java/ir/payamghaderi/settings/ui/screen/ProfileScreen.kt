package ir.payamghaderi.settings.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
    fun ProfileScreen() {

        Box(modifier = Modifier.fillMaxSize().padding(24.dp)){
            Column {  }
            Text(
                text = "Profile",
                fontSize = 32.sp

            )
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "Personal Information",
                fontSize = 32.sp,
            )
            Spacer(modifier = Modifier.height(32.dp))

            Text(
                text = "نام:علی احمدی",
                fontSize = 32.sp,
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "ایمیل:ali@.com",
                fontSize = 32.sp,
            )
        }
}
