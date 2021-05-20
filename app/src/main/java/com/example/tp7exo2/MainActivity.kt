package com.example.tp7exo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doc = Doctor(1, "badreddine", "zatout", "cardiologue")
        RoomService.context = this
        RoomService.appDatabase.getDoctorDao().addDoctor(doc)
        RoomService.appDatabase.getDoctorDao().getDoctors()
    }
}