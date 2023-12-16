package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        stringResource(R.string.jetpack_compose_tutorial),
                        stringResource(R.string.main_p1),
                        stringResource(R.string.main_p2))
                }
            }
        }
    }
}

@Composable
fun Article(title: String, p1: String, p2: String, modifier: Modifier = Modifier) {
    Column {
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .fillMaxWidth()
        )
        ArticleText(
            title,
            p1,
            p2,
            modifier = modifier
        )
    }
}

@Composable
fun ArticleText(title: String, p1: String, p2: String, modifier: Modifier = Modifier) {
    Text(
        text = title,
        fontSize = 24.sp,
        modifier = modifier
            .padding(16.dp)
    )
    Text(
        text = p1,
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(16.dp)
    )
    Text(
        text = p2,
        textAlign = TextAlign.Justify,
        modifier = modifier
            .padding(16.dp)
    )
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Article(
            stringResource(R.string.jetpack_compose_tutorial),
            stringResource(R.string.main_p1),
            stringResource(R.string.main_p2)
            )
    }
}
