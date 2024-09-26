package com.example.atividadeextra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Munchkin()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Munchkin() {
    var jogador by remember { mutableStateOf("") }
    var level by remember { mutableStateOf(1) }
    var equipamento by remember { mutableStateOf(0) }
    var modificadores by remember { mutableStateOf(0) }

    val poderTotal = level + equipamento + modificadores

    Column(modifier = Modifier.fillMaxSize().padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
    ) {
        Text("Gerenciamento de jogadores para Munchkin:")
        TextField(value = jogador, onValueChange = { jogador = it }, label = { Text(text = "Nome do jogador")})
        Text("Poder Total: $poderTotal")
        Spacer(modifier = Modifier.height(15.dp))
        Text("Level: $level")
        Row {

            Button(onClick = { if (level > 1) level-- }) {
                Text("-")
            }
            Button(onClick = { if (level < 10) level++ }) {
                Text("+")
            }
        }

        Text("Bônus de Equipamento: $equipamento")
        Row {

            Button(onClick = { if (equipamento > 0) equipamento-- }) {
                Text("-")
            }
            Button(onClick = { if (equipamento < 40)equipamento++ }) {
                Text("+")
            }
        }

        Text("Modificadores: $modificadores")
        Row {

            Button(onClick = { if (modificadores > -5) modificadores-- }) {
                Text("-")
            }
            Button(onClick = { if (modificadores < 10)modificadores++ }) {
                Text("+")
            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMunchkin() {
    Munchkin()
}
