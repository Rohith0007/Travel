package com.udemy.TravelManagement.repository

import com.udemy.TravelManagement.entity.Train
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import java.util.*

interface TrainRepository : JpaRepository<Train?, Long?> {
    @Query(value = "from Train where fromStation=:from and toStation=:to and dateOfDeparture=:date")
    fun findTrains(
        @Param("from") from: String?,
        @Param("to") to: String?,
        @Param("date") date: Date?
    ): List<Train?>?

    @Query("SELECT DISTINCT t.fromStation FROM Train t")
    fun findFromCities(): List<String?>?

    @Query("SELECT DISTINCT t.toStation FROM Train t")
    fun findToCities(): List<String?>?
}