package com.example.tp7exo2

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Doctor::class, Booking::class, Treatment::class), version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun getDoctorDao():DoctorDao
    abstract fun getBookingDao():BookingDao
    abstract fun getTreatmentDao():TreatmentDao
}