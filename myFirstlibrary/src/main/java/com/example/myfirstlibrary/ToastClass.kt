package com.example.myfirstlibrary

import android.app.Activity
import android.content.Context
import android.widget.Toast

/**
 * @Author: Kamran Khan
 * @Date: 22,August,2023
 * @Accounts
 *      -> https://stackoverflow.com/users/17921670/kamran-khan
 */
object ToastClass {
    fun Activity.showToast(string:String){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show()
    }
}