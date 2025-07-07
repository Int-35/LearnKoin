package com.example.koinapplication.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin

class BaseClass: Application() {
    override fun onCreate() {
        super.onCreate()
            startKoin{
                androidLogger()
                androidContext(this@BaseClass)
                modules(appModule)
            }
        }
}
