package com.example.businesscard


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { paddingValues ->
                    Column(
                        Modifier.padding(paddingValues)
                    ) {
                        BusinessCard(Modifier.weight(1f))
                        BusinessCardFooter()
                    }
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .background(Color(240, 248, 255))
            .fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier
                .padding(36.dp, 100.dp)
                .fillMaxHeight(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Axel Y. V. Adjumany",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 60.sp,
                        fontFamily = FontFamily(Font(R.font.inter_18pt_regular))
                    ),
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    text = "Fondateur".uppercase(),
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.inter_24pt_regular)),
                        fontWeight = FontWeight.W800,
                        fontSize = 35.sp,
                        textDecoration = TextDecoration.Underline
                    )
                )
            }
            Column {
                Text(
                    text = "+225 05 657 028 64",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                        fontSize = 24.sp,
                    ),
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    text = "yvay03@gmail.com",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.inter_18pt_italic)),
                        fontSize = 24.sp,
                        textDecoration = TextDecoration.Underline
                    ),
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Text(
                    text = "Abidjan, Plateau Sorbonne",
                    style = TextStyle(
                        fontFamily = FontFamily(Font(R.font.inter_18pt_regular)),
                        fontSize = 24.sp
                    ),
                    modifier = Modifier.padding(bottom = 15.dp)
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "YXEV",
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.inter_24pt_regular)),
                            fontSize = 24.sp,
                            fontWeight = FontWeight.W800
                        )
                    )
                    Spacer(
                        modifier = Modifier.width(10.dp)
                    )
                    Icon(
                        Icons.Rounded.Star,
                        contentDescription = ""
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCardFooter(modifier: Modifier = Modifier) {
    val configuration = LocalConfiguration.current
    val maxHeight = configuration.screenHeightDp.dp

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(maxHeight * 0.2f)
            .background(Color(65, 105, 225)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "Logo",
            modifier = Modifier.size(180.dp),
            alignment = Alignment.Center,
            contentScale = ContentScale.Fit
        )
        Text(
            text = "YXEV".uppercase(),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.inter_18pt_bold)),
                textAlign = TextAlign.Start,
                color = Color.White
            ),
            modifier = Modifier.padding(bottom = 10.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Column {
            BusinessCard(Modifier.weight(1f))
            BusinessCardFooter()
        }
    }
}
