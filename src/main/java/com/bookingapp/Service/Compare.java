package com.bookingapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Compare {

    @Autowired
    DataBaseReader dataBaseReader;
    @Autowired
    CheckAvailableReservations checkAvailableReservations;

    public void compare(){
        ArrayList<Double> reservedId = checkAvailableReservations.reservedIds();
        List<Integer> reservedDateStart = checkAvailableReservations.reservedIds();
        List<Integer> reservedDateEnd = checkAvailableReservations.reservedIds();

        List<Double> idsPool = dataBaseReader.idReader();

        List<Double> finalIds = new ArrayList();

        int reserved = reservedId.size();
        int pool = idsPool.size();

    /*    List<Double> tempList = new ArrayList();
        for(int tempInd = 0; tempInd < reserved; tempInd++){
            tempList.add(reservedId.get(tempInd));
        }

     */
        if(reserved > pool){
            System.out.println("db error");
        }else if(reserved <= pool){
            System.out.println("ids pool " + idsPool);
            for(int reservedInd = 0; reservedInd < reserved; reservedInd++){ //int poolInd = 0; poolInd<pool; poolInd++
                if(idsPool.contains(reservedId.get(reservedInd))){ //<--need proper counter

                    finalIds.add(reservedId.get(reservedInd));
                    System.out.println("reserved ind id " + reservedId.get(reservedInd));
                    int remove = idsPool.indexOf(finalIds.get(reservedInd));
                    idsPool.remove(remove);
                    //System.out.println("reserved < pool " + finalIds);
                // for(int poolInd = 0; poolInd<pool; poolInd++){}
                }
            }
            System.out.println("reserved < pool " + idsPool);
        }


    }
}
