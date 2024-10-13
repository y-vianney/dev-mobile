package com.example.quadrants

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrants.ui.theme.QuadrantsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuadrantsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ShowQuadrants(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ShowQuadrants(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.weight(1f)
        ) {
            DrawQuadrant(
                "Text Composable",
                "Displays text and follows the recommended Material Design guidelines.",
                background = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            DrawQuadrant(
                "Image Composable",
                "Creates a composable that lays out and draws a given Painter class object",
                background = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (
            modifier = Modifier.weight(1f)
        ) {
            DrawQuadrant(
                "Row Composable",
                "A layout composable that places its children in a horizontal sequence.",
                background = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
            DrawQuadrant(
                "Column Composable",
                "A layout composable that places its children in a vertical sequence.",
                background = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun DrawQuadrant(title: String, content: String, background: Color, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize().background(background)
            .padding(16.dp),
        contentAlignment = Alignment.Center,
    ) {
        Column {
            Text(
                text = title,
                modifier = Modifier.padding(bottom = 16.dp),
                fontWeight = FontWeight(700),
                textAlign = TextAlign.Center
            )
            Text(
                text = content,
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuadrantsTheme {
        ShowQuadrants()
    }
}