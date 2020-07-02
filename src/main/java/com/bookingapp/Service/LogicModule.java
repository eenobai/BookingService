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

    public void test() throws IOException {

        List<Double> dataB = db.idReader();

        System.out.println(dataB.toString());

        ticket.ticketWriter("kek", "w", dataB, 3, 69, 96);


    }
}
