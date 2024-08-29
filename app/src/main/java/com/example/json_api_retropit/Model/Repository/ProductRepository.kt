package com.example.json_api_retropit.Model.Repository


import com.example.json_api_retropit.Model.API.ApiService
import com.example.json_api_retropit.Model.Data.Product

class ProductRepository(private val apiService: ApiService){
    suspend fun getProducts(): List<Product>{
        return apiService.getProducts()
    }
}