package com.example.tp7exo2

import androidx.room.*

@Dao
interface DoctorDao {

    @Query("select * from doctor")
    fun getDoctors():List<Doctor>

    @Insert
    fun addDoctor(doctor: Doctor)

    @Update
    fun updateDoctor(doctor: Doctor)

    @Delete
    fun deleteDoctor(doctor: Doctor)
}