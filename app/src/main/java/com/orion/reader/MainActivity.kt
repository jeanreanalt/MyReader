package com.orion.reader

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val webView = WebView(this)
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true
        webView.settings.databaseEnabled = true
        webView.settings.allowFileAccess = true
        webView.settings.allowContentAccess = true
        
        webView.webViewClient = WebViewClient() // Чтобы не открывалось в Chrome
        webView.webChromeClient = WebChromeClient() // Для консольных логов и диалогов
        
        webView.loadUrl("file:///android_asset/reader.html")
        setContentView(webView)
    }
}
