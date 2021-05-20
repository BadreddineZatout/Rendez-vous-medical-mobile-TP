package com.example.tp7exo2

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Doctor (
    @PrimaryKey
    val doctorId:Long,
    val firstName:String,
    val lastName: String,
    val speciality:String
)