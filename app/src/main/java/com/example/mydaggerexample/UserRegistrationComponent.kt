package com.example.mydaggerexample

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService
}