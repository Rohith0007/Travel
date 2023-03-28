package com.udemy.TravelManagement.entity

import com.udemy.TravelManagement.entity.common.AbstractEntity
import java.util.*
import javax.persistence.Entity

@Entity
class Train : AbstractEntity() {
    var trainNumber: String? = null
    var trainName: String? = null
    var fromStation: String? = null
    var toStation: String? = null
    var dateOfDeparture: Date? = null
    var departureTime: String? = null
    var arrivalTime: String? = null
    var journeyTime: String? = null
    var price: Int? = 0
}