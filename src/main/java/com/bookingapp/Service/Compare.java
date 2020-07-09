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
    ReservedDataBaseReader reservedDataBaseReader;


/*    List<String> location = dataBaseReader.locationReader();

    List<Double> finalIdsPool = new ArrayList();
*/
    public List<Double> compare(){
        List<Double> idsPool = dataBaseReader.idReader();
        List<Double> reservedId = reservedDataBaseReader.reservedIds();
        List<Double> finalIds = new ArrayList();
        int reserved = reservedId.size();
        int pool = idsPool.size();

        if(reserved > pool){
            System.out.println("db error");
        }else if(reserved <= pool){
            for(int reservedInd = 0; reservedInd < reserved; reservedInd++){ //int poolInd = 0; poolInd<pool; poolInd++
                if(idsPool.contains(reservedId.get(reservedInd))){ //<--need proper counter
                    finalIds.add(reservedId.get(reservedInd));
                    int remove = idsPool.indexOf(finalIds.get(reservedInd));
                    idsPool.remove(remove);
                }
            }
        }
    return idsPool;
    }

    public List<String> outputListOfLocations(){
        List<Double> fullIdsPool = dataBaseReader.idReader();
        List<Double> idsPool;
        idsPool = compare();
        List<String> location = dataBaseReader.locationReader();
        List<String> locationIds = new ArrayList();
        for(int indx = 0; indx < idsPool.size(); indx++){
            int indxOf = fullIdsPool.indexOf(idsPool.get(indx));
            locationIds.add(location.get(indxOf));
        }
        return locationIds;
    }

    public List<String> outputListOfNames(){
        List<Double> fullIdsPool = dataBaseReader.idReader();
        List<Double> idsPool;
        idsPool = compare();
        List<String> reservationName = dataBaseReader.reservationNamReader();
        List<String> nameIds = new ArrayList();
        for(int indx = 0; indx < idsPool.size(); indx++){
            int indxOf = fullIdsPool.indexOf(idsPool.get(indx));
            nameIds.add(reservationName.get(indxOf));
        }
        return nameIds;
    }


}
