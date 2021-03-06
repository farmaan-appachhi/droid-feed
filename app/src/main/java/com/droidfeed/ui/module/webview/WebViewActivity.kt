package com.droidfeed.ui.module.webview

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.droidfeed.R
import com.droidfeed.databinding.ActivityWebviewBinding
import com.droidfeed.ui.common.BaseActivity

class WebViewActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityWebviewBinding>(
            this,
            R.layout.activity_webview
        )

        init(binding)
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun init(binding: ActivityWebviewBinding) {
        val webSiteUrl = intent.getStringExtra(EXTRA_URL)

        binding.apply {
            webView.settings.javaScriptEnabled = true

            url = webSiteUrl
            toolbarTitle = webSiteUrl
            setToolbarHomeNavClickListener {
                onBackPressed()
            }
        }
    }

    companion object {
        const val EXTRA_URL = "url"
    }
}