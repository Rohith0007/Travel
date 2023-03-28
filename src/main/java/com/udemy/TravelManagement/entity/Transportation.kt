package com.udemy.TravelManagement.entity

import com.udemy.TravelManagement.entity.common.AbstractEntity
import java.sql.Timestamp
import java.util.*
import javax.persistence.Entity

@Entity
class Transportation : AbstractEntity() {
    var type: String? = null
    var departureCity: String? = null
    var arrivalCity: String? = null
    var dateOfDeparture: Date? = null
    var estimatedDepartureTime: Timestamp? = null
}
