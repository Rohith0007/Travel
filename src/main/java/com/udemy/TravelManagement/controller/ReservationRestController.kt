package com.udemy.TravelManagement.controller

import com.udemy.TravelManagement.Dto.ReservationUpdateRequest
import com.udemy.TravelManagement.entity.Reservation
import com.udemy.TravelManagement.repository.ReservationRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class ReservationRestController {
    @Autowired
    var reservationRepository: ReservationRepository? = null
    @RequestMapping("/reservations/{id}")
    fun findReservation(@PathVariable id: Long): Reservation {
        return reservationRepository!!.findById(id).get()
    }

    @PostMapping("/reservations")
    fun updateReservation(@RequestBody request: ReservationUpdateRequest): Reservation {
        val currReservation = reservationRepository!!.findById(request.id).get()
        currReservation.checkedIn = request.checkedIn
        currReservation.numberOfBags = request.numberOfBags
        return reservationRepository!!.save(currReservation)
    }
}