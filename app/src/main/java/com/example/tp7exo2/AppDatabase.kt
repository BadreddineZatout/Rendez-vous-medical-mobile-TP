package com.example.tp7exo2

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters

@Database(entities = arrayOf(Doctor::class, Booking::class, Treatment::class), version = 1)
@TypeConverters(Converters::class)
abstract class AppDatabase:RoomDatabase() {
    abstract fun getDoctorDao():DoctorDao
    abstract fun getBookingDao():BookingDao
    abstract fun getTreatmentDao():TreatmentDao
}