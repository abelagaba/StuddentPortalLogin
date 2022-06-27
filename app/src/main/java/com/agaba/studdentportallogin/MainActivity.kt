package com.agaba.studdentportallogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val web:WebView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val web = findViewById<WebView>(R.id.webview)
        web.webViewClient = WebViewClient()
        web.loadUrl("www.student.mak.ac.ug")
        val webSettings = web.settings
        webSettings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        if(web!!.canGoBack()) {
            web.goBack()
        }
        super.onBackPressed()
    }
}