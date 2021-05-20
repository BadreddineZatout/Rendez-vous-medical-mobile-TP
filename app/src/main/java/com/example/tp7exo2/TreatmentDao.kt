package com.example.tp7exo2

import androidx.room.*
import java.util.*

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

    @Query("select * from Treatment where treatmentBeginDate>=:current and treatmentEndDate<=:current")
    fun getCurrentTreatments(current:Date):List<Treatment>

    @Query("select * from treatment natural join booking natural join doctor where lastName like :docName")
    fun getCurrentTreatmentByDoctor(docName:String):List<Treatment>

}