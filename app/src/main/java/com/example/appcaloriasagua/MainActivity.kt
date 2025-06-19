package com.example.appcaloriasagua

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.appcaloriasagua.ui.theme.AppCaloriasAguaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppCaloriasAguaTheme {
                AppContent()
            }
        }
    }
}

@Composable
fun AppContent() {
    var copos by remember { mutableIntStateOf(0) }
    var calorias by remember { mutableIntStateOf(0) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Copos de Água: $copos", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { copos++ }) {
                Text("Beber um copo")
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text("Calorias: $calorias", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { calorias += 100 }) {
                Text("Adicionar 100 calorias")
            }

            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = {
                copos = 0
                calorias = 0
            }) {
                Text("Reiniciar dia")
            }
        }
    }
}
