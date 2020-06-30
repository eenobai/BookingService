package com.bookingapp.GettersNSetters;

public class Reservation {

    private int reservationID;
    private String roomType;
    private String location;
    private int reservationDateStart;
    private int reservationDateEnd;

    public Reservation(int reservationID, String roomType, String location, int reservationDateStart, int reservationDateEnd){
        this.reservationID = reservationID;
        this.roomType = roomType;
        this.location = location;
        this.reservationDateStart = reservationDateStart;
        this.reservationDateEnd = reservationDateEnd;
    }

    public int getReservationID(){
        return reservationID;
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


}
