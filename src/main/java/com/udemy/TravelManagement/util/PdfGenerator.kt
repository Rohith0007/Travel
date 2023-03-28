package com.udemy.TravelManagement.util

import com.itextpdf.text.Document
import com.itextpdf.text.Phrase
import com.itextpdf.text.pdf.PdfPCell
import com.itextpdf.text.pdf.PdfPTable
import com.itextpdf.text.pdf.PdfWriter
import com.udemy.TravelManagement.entity.Reservation
import org.springframework.stereotype.Component
import java.io.FileOutputStream

@Component
class PdfGenerator {
    fun generateItinerary_F(reservation: Reservation, filePath: String?) {
        val document = Document()
        try {
            PdfWriter.getInstance(document, FileOutputStream(filePath))
            document.open()
            document.add(generateTable_F(reservation))
            document.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun generateTable_F(reservation: Reservation): PdfPTable {
        val table = PdfPTable(2)
        var cell: PdfPCell
        cell = PdfPCell(Phrase("Flight Itinerary"))
        cell.colspan = 2
        table.addCell(cell)
        cell = PdfPCell(Phrase("Flight Details"))
        cell.colspan = 2
        table.addCell(cell)
        table.addCell("Departure city")
        table.addCell(reservation.flight!!.departureCity)
        table.addCell("Arrival city")
        table.addCell(reservation.flight!!.arrivalCity)
        table.addCell("Flight number ")
        table.addCell(reservation.flight!!.flightNumber)
        table.addCell("Departure Time")
        table.addCell(reservation.flight!!.operatingAirlines)
        table.addCell("Operating Airlines")
        table.addCell(reservation.flight!!.estimatedDepartureTime.toString())
        cell = PdfPCell(Phrase("Passenger Details"))
        cell.colspan = 2
        table.addCell(cell)
        table.addCell("First Name")
        table.addCell(reservation.passenger!!.firstName)
        table.addCell("Last Name")
        table.addCell(reservation.passenger!!.lastName)
        table.addCell("Email")
        table.addCell(reservation.passenger!!.email)
        table.addCell("Phone")
        table.addCell(reservation.passenger!!.phone)
        return table
    }

    fun generateItinerary_T(reservation: Reservation, filePath: String?) {
        val document = Document()
        try {
            PdfWriter.getInstance(document, FileOutputStream(filePath))
            document.open()
            document.add(generateTable_T(reservation))
            document.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun generateTable_T(reservation: Reservation): PdfPTable {
        val table = PdfPTable(2)
        var cell: PdfPCell
        cell = PdfPCell(Phrase("Train Itinerary"))
        cell.colspan = 2
        table.addCell(cell)
        cell = PdfPCell(Phrase("Train Details"))
        cell.colspan = 2
        table.addCell(cell)
        table.addCell("Train number")
        table.addCell(reservation.train!!.trainNumber)
        table.addCell("Train name")
        table.addCell(reservation.train!!.trainName)
        table.addCell("From station")
        table.addCell(reservation.train!!.fromStation)
        table.addCell("To station")
        table.addCell(reservation.train!!.toStation)
        table.addCell("Date of departure")
        table.addCell(reservation.train!!.dateOfDeparture.toString())
        table.addCell("Departure time")
        table.addCell(reservation.train!!.departureTime)
        table.addCell("Arrival time")
        table.addCell(reservation.train!!.arrivalTime)
        table.addCell("Journey time")
        table.addCell(reservation.train!!.journeyTime)
        table.addCell("Price")
        table.addCell(reservation.train!!.price.toString())
        cell = PdfPCell(Phrase("Passenger Details"))
        cell.colspan = 2
        table.addCell(cell)
        table.addCell("First Name")
        table.addCell(reservation.passenger!!.firstName)
        table.addCell("Last Name")
        table.addCell(reservation.passenger!!.lastName)
        table.addCell("Email")
        table.addCell(reservation.passenger!!.email)
        table.addCell("Phone")
        table.addCell(reservation.passenger!!.phone)
        return table
    }

}