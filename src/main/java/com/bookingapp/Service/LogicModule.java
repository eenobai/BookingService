package com.bookingapp.Service;

import com.bookingapp.GettersNSetters.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.IOException;
import java.util.List;


@Component
public class LogicModule {
    @Autowired
    TicketWriter ticketWriter;
    @Autowired
    DataBaseReader db;
    @Autowired
    StoreData storeData;
    @Autowired
    EntryDeleter entryDeleter;
    @Autowired
    Reservation reservation;
    @Autowired
    ReservedDataBaseReader reservedDataBaseReader;
    @Autowired
    Compare compare;


    public void test() throws IOException {
        //ticketWriter.ticketWriter(reservation.getName(), reservation.getSureName(), reservation.getReservationID(), 3, 69, 96, compare.outputListOfLocations(), compare.outputListOfNames());
    }
}
