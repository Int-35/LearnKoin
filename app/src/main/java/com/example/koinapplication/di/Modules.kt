package com.example.koinapplication.di

import com.example.koinapplication.UserRepository
import com.example.koinapplication.UserViewModel
import com.example.koinapplication.data.ApiService
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { ApiService() }
    single { UserRepository( get()) }
    viewModel{ UserViewModel(get()) }
}