package com.bookingapp.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;


@Component
public class TicketWriter {


    public void ticketWriter(String name, String sureName, List<Double> id, int idIndex, int reservationDateStart, int reservationDateEnd) throws IOException {
        XSSFWorkbook workBook = new XSSFWorkbook();
        XSSFSheet sheet = workBook.createSheet("Reservation Ticket");

        //System.out.println("Writer" + reservation.tempReservationIDArray.toString() + reservation.tempReservationNameArray.toString() + reservation.tempReservationLocationArray.toString());
           /* name = "kek";
            sureName = "w";
            idIndex = 2;
            reservationDateStart = 69;
            reservationDateEnd = 96;
            */


            Row nameRow = sheet.createRow(2); //clients name
            Cell nameCell = nameRow.createCell(2);
            nameCell.setCellValue(name);

            Row sureNameRow = sheet.getRow(2); //clients surename
            Cell sureNameCell = sureNameRow.createCell(3);
            sureNameCell.setCellValue(sureName);

            Row idRow = sheet.getRow(2);  //booking id
            Cell idCell = idRow.createCell(7);
            idCell.setCellValue(id.get(idIndex));

            Row reservationStartRow = sheet.createRow(7);
            Cell reservationStartCell = reservationStartRow.createCell(2);
            reservationStartCell.setCellValue(reservationDateStart);

            Row reservationEndRow = sheet.getRow(7);
            Cell reservationEndCell = reservationEndRow.createCell(3);
            reservationEndCell.setCellValue(reservationDateEnd);

            //TODO - add Location and Name of the booking


        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demoTicket.xlsx")) {
            workBook.write(outputStream);
        }
    }

}