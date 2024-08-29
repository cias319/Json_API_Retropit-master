package com.example.json_api_retropit.Model.Data

data class User(
    val id: Int,
    val email: String,
    val username: String,
    val password: String,
    val name: Name
)
data class Name(
    val firstname:String,
    val lastname: String
)