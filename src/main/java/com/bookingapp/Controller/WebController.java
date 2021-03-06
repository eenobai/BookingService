package com.bookingapp.Controller;

import com.bookingapp.GettersNSetters.Reservation;
import com.bookingapp.Service.Compare;
import com.bookingapp.Service.DataBaseReader;
import com.bookingapp.Service.TicketWriter;
import com.bookingapp.Service.CleaningUpServices.EntryDeleter;
import com.mongodb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.UnknownHostException;
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
    @Autowired
    Reservation reservation;
    @Autowired
    TicketWriter ticketWriter;
    @Autowired
    EntryDeleter entryDeleter;


    @GetMapping("/newReservation")
    public HashMap reservationForm(Model model){
        model.addAttribute("???", new WebController());
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

    @GetMapping("/test")
    public HashMap testing(Model model) throws UnknownHostException {
        model.addAttribute("???", new WebController());
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("Reservations");
        DBCollection collection = database.getCollection("Reservations");
        DBCursor cursor = collection.find();
        HashMap<String, List<DBObject>> output = new HashMap<String, List<DBObject>>();
        List<DBObject> testList = new ArrayList<>();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
            testList.add(cursor.next());

        }
        output.put("test", testList);
        return output;
    }


    @PostMapping("/newReservation")
    public void selectReservation(@RequestBody Reservation reservation) throws IOException {

        int i = compare.outputListOfNames().indexOf(reservation.getReservationName());
        System.out.println("getReservationName " + reservation.getReservationName());
        System.out.println(compare.outputListOfNames());
        System.out.println("indx id " + i);

        ticketWriter.ticketWriter(reservation.getName(), reservation.getSureName(), compare.compare(), i, 69, 96, compare.outputListOfLocations(), compare.outputListOfNames());

    }

    @PostMapping("/removeReservation")
    public void removeReservation(@RequestBody Reservation reservation) throws IOException{
        entryDeleter.deleteEntry(reservation.getReservationName(), 1);
    }

}