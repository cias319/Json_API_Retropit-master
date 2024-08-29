package com.example.json_api_retropit.Model.API


import retrofit2.http.GET

interface ApiService{
    @GET("Products")
    suspend fun getProducts(): List<com.example.json_api_retropit.Model.Data.Product>
    @GET("Users")
    suspend fun getUsers():List<com.example.json_api_retropit.Model.Data.User>
}