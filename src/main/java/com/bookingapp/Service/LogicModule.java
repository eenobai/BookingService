package com.bookingapp.Service;

import com.bookingapp.GettersNSetters.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    EntryDeleter entryDeleter;
    @Autowired
    Reservation reservation;
    @Autowired
    ReservedDataBaseReader reservedDataBaseReader;
    @Autowired
    Compare compare;


    public void test() throws IOException {

        List<Double> id = db.idReader();
        List<String> location = db.locationReader();
        List<String> reservationName = db.reservationNamReader();
        List<Double> reservedIds = reservedDataBaseReader.reservedIds();

        //compare.outputListOfInfo();

        //compare.outputListOfInfo();

        //storeData.cellCheck();
        //storeData.storeData(id.get(reservation.getIdIndex()), reservation.getReservationDateStart(), reservation.getReservationDateEnd(), storeData.cellCheck());
        //storeData.storeData(133333337, 666999, 999666, storeData.cellCheck()); //<< for testing purposes
        //entryDeleter.deleteEntry(3);


        //System.out.println(id.toString());

        //ticket.ticketWriter("kek", "w", id, 3, 69, 96, location, reservationName);

        //TODO name, sureName, index, reservationDateStart and reservationDateEnd require REST integration

    }
}
