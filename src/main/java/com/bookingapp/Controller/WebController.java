package com.bookingapp.Controller;

import com.bookingapp.GettersNSetters.Reservation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    @GetMapping("/newReservation")
    public void nameInput(Model model){
        model.addAttribute("name", new Reservation());
    }

    @PostMapping("/newReservation")
    public void nameSubmit(@ModelAttribute Reservation reservation){

    }

}
