package com.bookingapp.Service;

import com.bookingapp.GettersNSetters.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bookingapp.Service.DataBaseReader;
import com.bookingapp.Service.DataBaseReader;

import javax.xml.crypto.Data;
import java.io.IOException;

@Component
public class LogicModule {

    DataBaseReader dataBaseReader = new DataBaseReader();
    TicketWriter ticketWriter = new TicketWriter();

    Reservation reservation = new Reservation();

    public LogicModule() throws IOException {
    }

    public void testMethod() throws IOException {

        ticketWriter.ticketWriter();
        dataBaseReader.dataBaseReader();
    }

}
