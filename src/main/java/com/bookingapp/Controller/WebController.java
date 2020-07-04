package com.bookingapp.Controller;

import com.bookingapp.GettersNSetters.Reservation;
import com.bookingapp.Service.DataBaseReader;
import com.bookingapp.Service.EntryDeleter;
import com.bookingapp.Service.LogicModule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
@RestController
public class WebController {

    @Autowired
    DataBaseReader dataBaseReader;


    @GetMapping("/newReservation")
    public List<Double> reservationForm(Model model){
        model.addAttribute("???", new WebController());
        List<String> test= new ArrayList();
        System.out.println("check test kek");
        return dataBaseReader.idReader();
    }

    @PostMapping("/newReservation")
    public double reservationSubmit(@ModelAttribute Reservation reservation){
        return 12;
    }

}
