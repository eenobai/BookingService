package com.bookingapp.Service;

import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.List;

@Component
public class LogicModule {

    public void test() throws IOException {

        TicketWriter ticket = new TicketWriter();
        DataBaseReader db = new DataBaseReader();

        List<Double> dataB = db.idReader();
        System.out.println(dataB.toString());

        ticket.ticketWriter("kek", "w", dataB, 2, 69, 96);


    }
}
