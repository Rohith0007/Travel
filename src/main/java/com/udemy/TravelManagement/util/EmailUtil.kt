package com.udemy.TravelManagement.util

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Component
import java.io.File

@Component
class EmailUtil {
    @Autowired
    private val sender: JavaMailSender? = null
    fun sendItinerary(toAddress: String?, filePath: String?) {
        val message = sender!!.createMimeMessage()
        var messageHelper: MimeMessageHelper? = null
        try {
            messageHelper = MimeMessageHelper(message, true)
            messageHelper.setTo(toAddress)
            messageHelper.setSubject("Itinerary")
            messageHelper.addAttachment("ItineraryFile", File(filePath))
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}