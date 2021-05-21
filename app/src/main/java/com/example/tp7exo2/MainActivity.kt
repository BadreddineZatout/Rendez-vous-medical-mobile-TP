package com.example.tp7exo2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doc1 = Doctor(1, "Badreddine", "Zatout", "Cardioloque")
        val doc2 = Doctor(2, "Nassim", "Laghoub", "ORL")
        RoomService.appDatabase.getDoctorDao().addDoctor(doc1)
        RoomService.appDatabase.getDoctorDao().addDoctor(doc2)
        val book1 = Booking(1, Date(2021,4,14), "1h", 1)
        val book2 = Booking(2, Date(2021,4,15), "1h", 1)
        val book3 = Booking(3, Date(2021,0,18), "1h", 2)
        val book4 = Booking(4, Date(2020,8,20), "1h", 2)
        RoomService.appDatabase.getBookingDao().addbooking(book1)
        RoomService.appDatabase.getBookingDao().addbooking(book2)
        RoomService.appDatabase.getBookingDao().addbooking(book3)
        RoomService.appDatabase.getBookingDao().addbooking(book4)
        var beginDate = Date(2021,4,14)
        var endDate = Date(2021,7,14)
        val t1 = Treatment(1,"disease1", "description 1", beginDate, endDate, 1)
        beginDate = Date(2021,4,15)
        endDate = Date(2021,5,15)
        val t2 = Treatment(2,"disease2", "description 2", beginDate, endDate, 2)
        RoomService.appDatabase.getTreatmentDao().addTreatment(t1)
        RoomService.appDatabase.getTreatmentDao().addTreatment(t2)
        beginDate = Date(2021,9,21)
        endDate = Date(2021,11,21)
        val t3 = Treatment(3,"disease3", "description 3", beginDate, endDate, 1)
        RoomService.appDatabase.getTreatmentDao().addTreatment(t3)
        val d = Date(2021,4,21)
        val list = RoomService.appDatabase.getTreatmentDao().getCurrentTreatmentByDoctor("Zatout", d)
        //val t = Date(2021,4,15).time.toLong() > d.toLong()
        affiche.text = list.toString()
        //affiche2.text = Date(2021,4,15).time.toLong().toString()
    }
}