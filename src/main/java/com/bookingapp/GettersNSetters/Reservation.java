package com.bookingapp.GettersNSetters;

public class Reservation {

    private int reservationID;
    private String roomType;
    private String location;
    private int reservationDateStart;
    private int reservationDateEnd;
    private String name;
    private String sureName;

    public Reservation(int reservationID, String roomType, String location, int reservationDateStart, int reservationDateEnd, String name, String sureName){
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

    public int getReservationID(){
        return 69;
        //return reservationID;
    }
    public String getRoomType(){
        return roomType;
    }
    public String getLocation(){
        return location;
    }
    public int getReservationDateStart(){
        return 7331;
        //return reservationDateStart;
    }
    public int getReservationDateEnd(){
        return 1337;
        //return reservationDateEnd;
    }
    public String getName(){
        //return name;
        return "name";
    }
    public String getSureName(){
        return "surename";
        //return sureName;
    }

    public void setReservationID(){
        this.reservationID = reservationID;
    }
    public void setRoomType(){
        this.roomType = roomType;
    }
    public void setLocation(){
        this.location = location;
    }
    public void setReservationDateStart(){
        this.reservationDateStart = reservationDateStart;
    }
    public void setReservationDateEnd(){
        this.reservationDateEnd = reservationDateEnd;
    }
    public void setName(){
        this.name = name;
    }
    public void setSureName(){
        this.sureName = sureName;
    }

}
