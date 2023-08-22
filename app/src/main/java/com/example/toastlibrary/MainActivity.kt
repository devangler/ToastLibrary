package com.example.toastlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.myfirstlibrary.ToastClass
import com.example.myfirstlibrary.ToastClass.showToast

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showToast("DavAngler")

    }
}
