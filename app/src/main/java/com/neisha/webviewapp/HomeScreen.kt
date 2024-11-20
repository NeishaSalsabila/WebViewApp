package com.neisha.webviewapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Web View") }
            )
        },
        modifier = modifier
    ) { paddingValues ->
        HomeContent(modifier = Modifier.padding(paddingValues))
    }
}
