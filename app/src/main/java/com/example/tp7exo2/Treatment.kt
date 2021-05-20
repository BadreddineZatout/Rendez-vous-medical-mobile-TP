package com.example.tp7exo2

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Treatment (
    @PrimaryKey
    val treatmentId:Long,
    val disease:String,
    val treatmentDescription:String,
    val treatmentBeginDate:Date,
    val treatmentEndDate:Date
)