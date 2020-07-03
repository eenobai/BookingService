package com.bookingapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.List;


@Component
public class LogicModule {
    @Autowired
    TicketWriter ticket;
    @Autowired
    DataBaseReader db;
    @Autowired
    StoreData storeData;

    public void test() throws IOException {

        List<Double> id = db.idReader();
        List<String> location = db.locationReader();
        List<String> reservationName = db.reservationNamReader();

        storeData.cellCheck();
        storeData.storeData(69);



        System.out.println(id.toString());

        ticket.ticketWriter("kek", "w", id, 3, 69, 96, location, reservationName);

        //TODO name, sureName, index, reservationDateStart and reservationDateEnd require REST integration

    }
}
