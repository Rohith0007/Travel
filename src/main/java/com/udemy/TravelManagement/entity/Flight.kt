package com.udemy.TravelManagement.entity

import com.udemy.TravelManagement.entity.common.AbstractEntity
import java.math.BigDecimal
import java.sql.Date
import java.sql.Timestamp
import javax.persistence.Entity

@Entity
class Flight : AbstractEntity() {
    var flightNumber: String? = null
    var operatingAirlines: String? = null
    var departureCity: String? = null
    var estimatedDepartureTime: Timestamp? = null // Rename departureTime to estimatedDepartureTime
    var arrivalCity: String? = null
    var arrivalDate: Date? = null // Add arrivalDate column
    var journeyTime: Int? = null
    var mode: String? = null
    var price: BigDecimal? = null // Rename economyPrice to price
    var dateOfDeparture: Date? = null // Add dateOfDeparture column
}
