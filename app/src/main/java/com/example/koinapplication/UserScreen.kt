package com.example.koinapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.koin.androidx.compose.koinViewModel


@Composable
fun UserScreen(
    viewModel: UserViewModel
) {

    val users = viewModel.showUsers()
    val load = remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button( onClick = {
            load.value = true
        }) {
            Text(text = "Load Users")
        }

        if (load.value){
            users.forEach {
                Text(text = it)
            }
        }
    }


}