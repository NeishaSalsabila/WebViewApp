package com.neisha.webviewapp

import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun HomeContent(
    modifier: Modifier = Modifier
) {
    val url = "https://pusatinformasi.kampusmerdeka.kemdikbud.go.id/hc/id"

    AndroidView(
        factory = { context ->
            WebView(context).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = WebViewClient().apply {
                    settings.javaScriptEnabled = true
                }
                loadUrl(url)
            }
        },
        modifier = modifier.fillMaxSize()
    )
}
