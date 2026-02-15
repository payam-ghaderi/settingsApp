package ir.payamghaderi.settings

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import ir.payamghaderi.settings.ui.screen.SettingsScreenWithNavController
import ir.payamghaderi.settings.ui.theme.SettingsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SettingsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(modifier = Modifier.padding(innerPadding)){
                     //   SettingsScreen()
                        var navController = rememberNavController()
                        var startDestination = "settings"
                        var routes = listOf("settings" , "profile" , "privacy")
                        SettingsScreenWithNavController(navController,startDestination,routes,innerPadding)
                    }
                }
            }
        }
    }
}
