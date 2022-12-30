package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

interface ScheduleRepository {

    fun getFullScheduleStream(): Flow<List<BusSchedule>>

    fun getScheduleForStream(stopName: String): Flow<List<BusSchedule>>
}