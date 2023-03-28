package com.udemy.TravelManagement.repository

import com.udemy.TravelManagement.entity.Reservation
import org.springframework.data.jpa.repository.JpaRepository

interface ReservationRepository : JpaRepository<Reservation?, Long?>