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

    @Query("select * from Treatment where treatmentBeginDate<=:d and treatmentEndDate>=:d")
    fun getCurrentTreatments(d:Date):List<Treatment>
    /*@Query("select count(*) from Treatment where treatmentBeginDate<=:d and treatmentEndDate>=:d")
    fun getCurrentTreatments(d:Date):Int*/

    @Query("select * from treatment natural join booking natural join doctor where lastName like :docName")
    fun getCurrentTreatmentByDoctor(docName:String):List<Treatment>

}