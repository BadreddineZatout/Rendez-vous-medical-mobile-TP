package com.example.tp7exo2

import androidx.room.*

@Dao
interface TreatmentDao {

    @Query("select * from treatment")
    fun getTreatments():List<Treatment>

    @Insert
    fun addTreatment(treatment: Treatment)

    @Update
    fun updateTreatment(treatment: Treatment)

    @Delete
    fun deleteTreatment(treatment: Treatment)
}