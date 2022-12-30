package com.example.busschedule

import android.app.Application
import com.example.busschedule.data.AppContainer
import com.example.busschedule.data.DefaultAppContainer

class BusScheduleApp : Application() {

    lateinit var appContainer: AppContainer
    override fun onCreate() {
        super.onCreate()
        appContainer = DefaultAppContainer(this)
    }
}