package com.example.json_api_retropit.Model.Repository

import com.example.json_api_retropit.Model.API.ApiService
import com.example.json_api_retropit.Model.Data.User

class UserRepository(private val apiService: ApiService){
    suspend fun getUsers(): List<User>{
        return apiService.getUsers()
    }
}