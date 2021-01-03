package com.rizieq.campuran_app


import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        val web = findViewById<View>(R.id.web_view) as WebView
        web.loadUrl("https://idn.sch.id")
        web.webViewClient = WebViewClient()
    }
}