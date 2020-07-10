package com.bookingapp.Unused;

import com.bookingapp.GettersNSetters.Reservation;
import com.bookingapp.Service.Compare;
import com.bookingapp.Service.DataBaseReader;
import com.bookingapp.Service.ReservedDataBaseReader;
import com.bookingapp.Service.TicketWriter;
import com.bookingapp.Unused.EntryDeleter;
import com.bookingapp.Unused.StoreData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.io.IOException;


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

}
