package com.udemy.TravelManagement.Dto

class ReservationRequest {
    var flightId: Long? = null
    var trainId: Long? = null
    private var pFirstName: String? = null
    private var pLastName: String? = null
    private var pEmail: String? = null
    private var pPhone: String? = null
    var nameOnCard: String? = null
    var cardNumber: String? = null
    var expiryDate: String? = null
    var cvvNumber = 0

    fun getFlightId1(): Long? {
        return flightId
    }

    fun getTrainId1(): Long? {
        return trainId
    }
    fun getpFirstName(): String? {
        return pFirstName
    }

    fun setpFirstName(pFirstName: String?) {
        this.pFirstName = pFirstName
    }

    fun getpLastName(): String? {
        return pLastName
    }

    fun setpLastName(pLastName: String?) {
        this.pLastName = pLastName
    }

    fun getpEmail(): String? {
        return pEmail
    }

    fun setpEmail(pEmail: String?) {
        this.pEmail = pEmail
    }

    fun getpPhone(): String? {
        return pPhone
    }

    fun setpPhone(pPhone: String?) {
        this.pPhone = pPhone
    }
}