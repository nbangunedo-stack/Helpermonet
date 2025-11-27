package com.example.monethelper

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                Column(Modifier.padding(16.dp)) {
                    Text("Monet helper", style = MaterialTheme.typography.h5)
                    Spacer(Modifier.height(8.dp))
                    Text("This is a minimal Kotlin + Compose starter app ready for Codemagic build.")
                }
            }
        }
    }
}