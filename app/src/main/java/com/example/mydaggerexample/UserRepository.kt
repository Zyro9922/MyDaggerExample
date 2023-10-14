package com.example.mydaggerexample

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String){
        Log.d("ZYRO", "User saved successfully")
    }
}