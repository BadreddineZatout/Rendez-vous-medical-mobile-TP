package com.example.tp7exo2

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(foreignKeys = arrayOf(
    ForeignKey(entity = Booking::class, parentColumns = arrayOf("bookingId"),
    childColumns = arrayOf("idBooking"), onDelete = ForeignKey.CASCADE)
))
data class Treatment (
    @PrimaryKey
    val treatmentId:Long,
    val disease:String,
    val treatmentDescription:String,
    val treatmentBeginDate:Date,
    val treatmentEndDate:Date,
    val idBooking:Long
)