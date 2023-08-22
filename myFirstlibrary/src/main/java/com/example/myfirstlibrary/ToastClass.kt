package com.example.myfirstlibrary

import android.content.Context
import android.widget.Toast

/**
 * @Author: Kamran Khan
 * @Date: 22,August,2023
 * @Accounts
 *      -> https://stackoverflow.com/users/17921670/kamran-khan
 */
object ToastClass {
    fun  showToast(context:Context,string:String){
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show()
    }
}