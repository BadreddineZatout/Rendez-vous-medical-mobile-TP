package com.example.tp7exo2

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Booking (
    @PrimaryKey
    val bookingId:Long,
    val bookingDate:Date,
    val bookingTime: String
)