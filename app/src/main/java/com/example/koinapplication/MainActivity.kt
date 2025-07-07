package com.example.koinapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.koinapplication.ui.theme.KoinApplicationTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            KoinApplicationTheme {
                val viewModel: UserViewModel by viewModel()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   UserScreen(viewModel)
                }
            }
        }
    }
}

