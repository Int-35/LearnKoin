package com.example.koinapplication

import com.example.koinapplication.data.ApiService


class UserRepository (private val apiService: ApiService) {
    fun getUsers() = apiService.fetchUsers()
}