package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedule ORDER BY arrival_time ASC")
    fun getAllSchedulesStream(): Flow<List<BusSchedule>>

    @Query("SELECT * FROM schedule WHERE stop_name = :stopName")
    fun getScheduleStream(stopName: String): Flow<BusSchedule?>
}