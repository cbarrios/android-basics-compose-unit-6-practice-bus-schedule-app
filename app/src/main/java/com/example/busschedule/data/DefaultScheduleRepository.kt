package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

class DefaultScheduleRepository(private val scheduleDao: ScheduleDao) : ScheduleRepository {

    override fun getFullScheduleStream(): Flow<List<BusSchedule>> =
        scheduleDao.getFullScheduleStream()

    override fun getScheduleForStream(stopName: String): Flow<List<BusSchedule>> =
        scheduleDao.getScheduleForStream(stopName)
}