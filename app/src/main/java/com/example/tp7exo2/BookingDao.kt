package com.example.tp7exo2

import androidx.room.*

@Dao
interface BookingDao {

    @Query("select * from booking")
    fun getBookings():List<Booking>

    @Insert
    fun addbooking(booking: Booking)

    @Update
    fun updateBooking(booking: Booking)

    @Delete
    fun deletebooking(booking: Booking)
}