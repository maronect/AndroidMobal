package com.example.androidrotina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidrotina.ui.theme.AndroidRotinaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidRotinaTheme {
                Scaffold(modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 50.dp)

                ) { innerPadding ->
                    Greeting(
                        name = "Marone Carvalho Taques",
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val myimage = painterResource(id = R.drawable.maronecamisaazul)

    Column(
        modifier = modifier
            .padding(15.dp)
            .verticalScroll(rememberScrollState())
    ) {

        Text(
            text = "Conheça: $name",
            modifier = modifier
        )

        Image(
            painter = myimage,
            contentDescription = null,
            modifier = modifier
        )

        Text(
            text = "Acordando às 5:50, minha rotina na faculdade começa. Estudando das 7:30 às 12:50," +
                    " na UNICAP (Universidade Catolica de Pernanbuco), atualmente (2024.1), no 5to periodo." +
                    " Almoçando às 14:30 e indo para a academia às 15:30, volto para casa às 18:00 (moro longe da academia)." +
                    " A rotina de estudos começa após o jantar, às 19:00 até 22:00, quando desligo o computador.",
            modifier = modifier
        )
        Text(
            text = "Uma frase que gosto: “Um problema só é importante caso tenha solução, de outra forma, é um fato” – Marone Taques.",
            modifier = modifier
        )
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidRotinaTheme {
        Greeting("Marone Carvalho Taques")
    }
}