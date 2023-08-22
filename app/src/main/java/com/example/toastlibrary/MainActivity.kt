package com.example.toastlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.myfirstlibrary.ToastClass

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastClass.showToast(this,"DavAngler")

    }
}
