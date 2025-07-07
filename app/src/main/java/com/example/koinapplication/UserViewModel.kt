package com.example.koinapplication

import androidx.lifecycle.ViewModel



class UserViewModel (
    private val repository: UserRepository
) : ViewModel() {
    fun showUsers() = repository.getUsers()
}