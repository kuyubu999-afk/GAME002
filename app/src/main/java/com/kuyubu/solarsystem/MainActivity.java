package com.kuyubu.solarsystem;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 @Override public void onCreate(Bundle state) { super.onCreate(state); WebView web=new WebView(this); web.setBackgroundColor(0xFF070B18); WebSettings s=web.getSettings(); s.setJavaScriptEnabled(true); s.setDomStorageEnabled(true); s.setAllowFileAccess(true); web.setWebViewClient(new WebViewClient()); setContentView(web); web.loadUrl("file:///android_asset/index.html"); }
}
