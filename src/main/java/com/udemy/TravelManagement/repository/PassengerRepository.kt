package com.udemy.TravelManagement.repository

import com.udemy.TravelManagement.entity.Passenger
import org.springframework.data.jpa.repository.JpaRepository

interface PassengerRepository : JpaRepository<Passenger?, Long?>