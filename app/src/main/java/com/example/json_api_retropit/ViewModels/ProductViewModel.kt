package com.example.json_api_retropit.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.json_api_retropit.Model.API.RetrofitClient
import com.example.json_api_retropit.Model.Data.Product
import com.example.json_api_retropit.Model.Repository.ProductRepository
import kotlinx.coroutines.launch

class ProductVieModel: ViewModel(){
    private val _products= MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get()= _products
    private val repository= ProductRepository(RetrofitClient.apiService)

    fun fetchProducts(){
        viewModelScope.launch {
            try {
                val productList=repository.getProducts()
                _products.postValue(productList)
                println("API DATA CALLED: $productList")
            }
            catch(e:Exception){
                println("Error: $e")
            }
        }
    }
    init {
        fetchProducts()
    }
}