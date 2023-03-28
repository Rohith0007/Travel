package com.udemy.TravelManagement.controller;

import com.udemy.TravelManagement.entity.Train;
import com.udemy.TravelManagement.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.*;

@Controller
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    private TrainRepository trainRepository;

    @RequestMapping
    public String findTrains(
            @RequestParam("from") String from,
            @RequestParam("to") String to,
            @RequestParam("dateOfDeparture") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dateOfDeparture,
            Model model) {

        List<Train> trains = trainRepository.findTrains(from, to, dateOfDeparture);
        model.addAttribute("trains", trains);

        return "displayTrains";
    }

    @RequestMapping("/admin/showAddTrain")
    public String showAddTrain() {
        return "addTrain";
    }

}
