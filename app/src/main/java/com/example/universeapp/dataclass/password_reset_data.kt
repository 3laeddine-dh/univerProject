package com.example.universeapp.dataclass

data class password_reset_data(
    private var token : String,
    private var email : String,
    private var password : String,
    private var confirm_password : String)
