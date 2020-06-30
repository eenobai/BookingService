package com.bookingapp.GettersNSetters;

import java.util.ArrayList;

public class Reservation {

    public double reservationID;
    public String reservationName;
    private String roomType;
    private String location;
    private int reservationDateStart;
    private int reservationDateEnd;
    private String name;
    private String sureName;
    public ArrayList<Double> tempReservationIDArray= new ArrayList();
    public ArrayList<String> tempReservationNameArray = new ArrayList();

    public Reservation(double reservationID, String roomType, String location, int reservationDateStart, int reservationDateEnd, String name, String sureName){
        this.reservationID = reservationID;
        this.roomType = roomType;
        this.location = location;
        this.reservationDateStart = reservationDateStart;
        this.reservationDateEnd = reservationDateEnd;
        this.name = name;
        this.sureName = sureName;
    }

    public Reservation() {
    }

    public double getReservationID(){
        return 2; //temp for testing purposes
        //return reservationID;
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
    public ArrayList getIDArray(){
        return tempReservationIDArray;
    }
    public ArrayList getNameArray(){
        return tempReservationNameArray;
    }

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
    public void setIDArray(double reservationID){
        this.tempReservationIDArray.add(reservationID);
    }
    public void setNameArray(String reservationName){
        this.tempReservationNameArray.add(reservationName);
    }

}
