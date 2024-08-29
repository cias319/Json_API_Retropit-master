package com.example.json_api_retropit.ViewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.json_api_retropit.Model.API.RetrofitClient

import com.example.json_api_retropit.Model.Repository.UserRepository

import kotlinx.coroutines.launch

class UserVieModel: ViewModel(){
    private val _users= MutableLiveData<List<com.example.json_api_retropit.Model.Data.User>>()
    val users: LiveData<List<com.example.json_api_retropit.Model.Data.User>>
        get()= _users
    private val repository= UserRepository(RetrofitClient.apiService)

    fun fetchUsers(){
        viewModelScope.launch {
            try {
                val userList=repository.getUsers()
                _users.postValue(userList)
                println("API DATA CALLED: $userList")
            }
            catch(e:Exception){
                println("Error: $e")
            }
        }
    }
    init {
        fetchUsers()
    }
}