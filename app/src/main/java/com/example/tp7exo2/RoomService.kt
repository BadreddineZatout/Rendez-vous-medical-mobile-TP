package com.example.tp7exo2

import android.content.Context
import androidx.room.Room

object RoomService {
    lateinit var context:Context
    val appDatabase:AppDatabase by lazy{
        Room.databaseBuilder(context, AppDatabase::class.java, "Rendev_vous_medical").allowMainThreadQueries().build()
    }
}