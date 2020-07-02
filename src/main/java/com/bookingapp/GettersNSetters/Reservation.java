package com.bookingapp.GettersNSetters;
import org.springframework.context.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Reservation {

    public double reservationID;
    public String reservationName;
    private String roomType;
    private String location;
    private int reservationDateStart;
    private int reservationDateEnd;
    public String name;
    public String sureName;

/*
    public Reservation(double reservationID, String reservationName, String roomType, String location, int reservationDateStart, int reservationDateEnd, String name, String sureName, ArrayList<Double> tempReservationIDArray, ArrayList<String> tempReservationNameArray, ArrayList<String> tempReservationLocationArray){
        this.reservationID = reservationID;
        this.reservationName = reservationName;
        this.roomType = roomType;
        this.location = location;
        this.reservationDateStart = reservationDateStart;
        this.reservationDateEnd = reservationDateEnd;
        this.name = name;
        this.sureName = sureName;
        this.tempReservationIDArray = tempReservationIDArray;
        this.tempReservationNameArray = tempReservationNameArray;
        this.tempReservationLocationArray = tempReservationLocationArray;

    }
*/

    public double getReservationID(){
        return reservationID;
    }
    public String getReservationName(){
        return reservationName;
    }
    public String getRoomType(){
        return roomType;
    }
    public String getLocation(){
        return location;
    }
    public int getReservationDateStart(){
        return reservationDateStart;
    }
    public int getReservationDateEnd(){
        return reservationDateEnd;
    }
    public String getName(){
        return name;
    }
    public String getSureName(){
        return sureName;
    }
    //public ArrayList getIDArray(){
    //    return tempReservationIDArray;
    //}
   // public ArrayList getNameArray(){
     //   return tempReservationNameArray;
   // }
    //public ArrayList getLocationArray() {
    //    return tempReservationLocationArray;
   // }

    public void setReservationID(double reservationID){
        this.reservationID = reservationID;
    }
    public void setReservationName(String reservationName){
        this.reservationName = reservationName;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setReservationDateStart(int reservationDateStart){
        this.reservationDateStart = reservationDateStart;
    }
    public void setReservationDateEnd(int reservationDateEnd){
        this.reservationDateEnd = reservationDateEnd;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSureName(String sureName){
        this.sureName = sureName;
    }
  //  public void setIDArray(double reservationID){
   //     this.tempReservationIDArray.add(reservationID);
   // }
    //public void setNameArray(String reservationName){
   //     this.tempReservationNameArray.add(reservationName);
   // }
   // public void setLocationArray(String location){
    //    this.tempReservationLocationArray.add(location);
    //}

}
