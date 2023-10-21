package com.example.mydaggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydaggerexample.DaggerUserRegistrationComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRepository: UserRepository
        val emailService: EmailService

        val daggerUserRegistrationComponent = DaggerUserRegistrationComponent.create()
        daggerUserRegistrationComponent.getUserRegistrationService().registerUser("something@gmail.com", "mypassword")

    }
}