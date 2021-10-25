package com.lvlin.rainingweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class RainingWeatherApplication : Application(){

    companion object {
        const val TOKEN = "DjhZKLJG3RTzE8WE"
        @SuppressLint("StaticFieldLeak")
        lateinit var context :Context
    }


    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}