package com.bookingapp.Controller;

import com.bookingapp.GettersNSetters.Reservation;
import com.bookingapp.Service.Compare;
import com.bookingapp.Service.DataBaseReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;


import java.util.ArrayList;
import java.util.List;

@Component
@RestController
public class WebController {

    @Autowired
    DataBaseReader dataBaseReader;
    @Autowired
    Compare compare;


    @GetMapping("/newReservation")
    public HashMap reservationForm(Model model){
        model.addAttribute("???", new WebController());
        System.out.println("check test kek");
        List<Double> ids = compare.compare();
        List<String> locations = compare.outputListOfLocations();
        List<String> names = compare.outputListOfNames();
        List<String> idsToString = new ArrayList<String>();
        for(Double id : ids){
            idsToString.add(id.toString());
        }
        HashMap<String, List<String>> output = new HashMap<String, List<String>>();
        output.put("ids", idsToString);
        output.put("locations", locations);
        output.put("names", names);

       // output.put("ids", ids); <<need to figure this one out
        return output;
    }

    @PostMapping("/newReservation")
    public void selectReservation(@RequestBody Reservation reservation){

    }

}
