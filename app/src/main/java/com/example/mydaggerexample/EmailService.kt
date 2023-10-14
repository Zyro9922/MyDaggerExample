package com.example.mydaggerexample

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(from: String, body: String){
        Log.d("ZYRO", "Email sent successfully")
    }
}