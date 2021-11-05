package com.example.oneweekcode1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.oneweekcode1.ui.theme.Oneweekcode1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Oneweekcode1Theme {
                MyApp()
            }
        }
    }
}


@Composable
private fun MyApp() {
    Surface(color = MaterialTheme.colors.primary) {
        Greeting("Keyunghwan oh")
    }
}

@Composable
private fun Greeting(name: String) {
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
        Column(modifier = Modifier.weight(1f)) {
            Text(text = "Hello,")
            Text(text = name)
        }
           OutlinedButton(onClick = { /* TODO */}
            ) { Text("Show more")}
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun DefaultPreview() {
    Oneweekcode1Theme {
        MyApp()
    }
}