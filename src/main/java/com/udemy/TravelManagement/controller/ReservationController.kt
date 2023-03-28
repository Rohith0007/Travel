package com.udemy.TravelManagement.controller

import com.udemy.TravelManagement.Dto.ReservationRequest
import com.udemy.TravelManagement.repository.FlightRepository
import com.udemy.TravelManagement.repository.PassengerRepository
import com.udemy.TravelManagement.repository.TrainRepository
import com.udemy.TravelManagement.service.ReservationService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/reservation")
class ReservationController {
    @Autowired
    var flightRepository: FlightRepository? = null

    @Autowired
    var passengerRepository: PassengerRepository? = null

    @Autowired
    var trainRepository: TrainRepository? = null

    @Autowired
    var reservationService: ReservationService? = null

    @RequestMapping("/{id}")
    fun showCompleteReservation(@PathVariable("id") id: Long, @RequestParam(value = "mot", required = false) mot: String?, model: Model): String {
        return if (mot == "train") {
            val trains = trainRepository!!.findById(id).get()
            model.addAttribute("trains", trains)
            model.addAttribute("train", trains)
            "completeReservation_T"
        } else if (mot == "flight") {
            val flight = flightRepository!!.findById(id).get()
            model.addAttribute("flight", flight)
            model.addAttribute("flights", flight)
            "completeReservation_F"
        } else {
            "completeReservation_F"
        }
    }


    @PostMapping("/complete-reservation")
    fun completeReservation(@ModelAttribute reservationRequest: ReservationRequest, model: Model): String {
        val filePath = reservationService!!.bookFlight(reservationRequest)
        //        filePath = "file://"+filePath;
        model.addAttribute("filePath", filePath)
        if (reservationRequest.flightId != null) {
            val flight = flightRepository!!.findById(reservationRequest.flightId).get()
            model.addAttribute("flight", flight)
            model.addAttribute("reservationRequest", reservationRequest)
            println(filePath)
            return "reservationConfirmation_F"
        } else if (reservationRequest.trainId != null) {
            val train = trainRepository!!.findById(reservationRequest.trainId).get()
            model.addAttribute("train", train)
            model.addAttribute("reservationRequest", reservationRequest)
            println(filePath)
            return "reservationConfirmation_T"
        }

        return "reservationConfirmation_F"
    }
}