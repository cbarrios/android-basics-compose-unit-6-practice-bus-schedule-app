package com.example.busschedule.data

import android.content.Context

interface AppContainer {
    val scheduleRepository: ScheduleRepository
}

class DefaultAppContainer(context: Context) : AppContainer {

    override val scheduleRepository: ScheduleRepository by lazy {
        DefaultScheduleRepository(ScheduleDatabase.getDatabase(context).scheduleDao)
    }
}