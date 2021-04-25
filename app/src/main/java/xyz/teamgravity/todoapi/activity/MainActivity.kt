package xyz.teamgravity.todoapi.activity

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.Modifier
import xyz.teamgravity.todoapi.compose.component.IndefiniteProgressBar
import xyz.teamgravity.todoapi.compose.theme.AppTheme

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    LazyColumn {

                    }

                    IndefiniteProgressBar(isDisplayed = true)
                }
            }
        }
    }
}