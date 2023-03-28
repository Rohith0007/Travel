package com.udemy.TravelManagement.entity

import com.udemy.TravelManagement.entity.common.AbstractEntity
import javax.persistence.Column
import javax.persistence.Entity

@Entity //@Table(name = "PASSENGER",schema = "Udemy")

class Passenger : AbstractEntity() {
    var firstName: String? = null
    var lastName: String? = null
    var middleName: String? = null
    @Column(unique=true)
    var email: String? = null
    var phone: String? = null
    override fun toString(): String {
        return "Passenger{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}'
    }
}