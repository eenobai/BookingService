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

        if(reserved > pool){
            for(int reservedInd = 0; reservedInd<reserved; reservedInd++){
                for(int poolInd = 0; poolInd < pool; poolInd++){
                    if(!idsPool.get(poolInd).equals(reservedId.get(reservedInd))){
                        finalIds.add(idsPool.get(poolInd));
                        System.out.println("reserved > pool " + finalIds);
                    }
                }
            }
        }else if(reserved < pool){
            for(int reservedInd = 0; reservedInd < reserved; reservedInd++){ //int poolInd = 0; poolInd<pool; poolInd++
                for(int poolInd = 0; poolInd<pool; poolInd++){
                    if(!reservedId.contains(idsPool.get(poolInd)) && !finalIds.contains(reservedId.get(reservedInd))){ //<--need proper counter
                        finalIds.add(idsPool.get(poolInd));
                        System.out.println("reserved < pool " + finalIds);

                    }
                }
            }
            System.out.println("reserved < pool " + finalIds);
        }


    }
}
