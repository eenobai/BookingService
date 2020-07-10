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


    public void ticketWriter(String name, String sureName, double id, int idIndex, int reservationDateStart, int reservationDateEnd, List<String> reservationLocation, List<String> reservationName) throws IOException {
        XSSFWorkbook workBook = new XSSFWorkbook();
        XSSFSheet sheet = workBook.createSheet("Reservation Ticket");

            Row nameRow = sheet.createRow(2); //writes persons name in the selected cell
            Cell nameCell = nameRow.createCell(2);
            nameCell.setCellValue(name);

            Row sureNameRow = sheet.getRow(2); //writes persons surname in the selected cell
            Cell sureNameCell = sureNameRow.createCell(3);
            sureNameCell.setCellValue(sureName);

            Row idRow = sheet.getRow(2);  //writes reservation id in the selected cell
            Cell idCell = idRow.createCell(7);
            idCell.setCellValue(id);

            Row reservationStartRow = sheet.createRow(7);   //writes reservations start date
            Cell reservationStartCell = reservationStartRow.createCell(2);
            reservationStartCell.setCellValue(reservationDateStart);

            Row reservationEndRow = sheet.getRow(7);    //writes reservations enddate
            Cell reservationEndCell = reservationEndRow.createCell(3);
            reservationEndCell.setCellValue(reservationDateEnd);

            Row locationRow= sheet.getRow(7);   //writes reservations location
            Cell locationCell = locationRow.createCell(6);
            locationCell.setCellValue(reservationLocation.get(idIndex));

            Row bookingNameRow = sheet.getRow(7);   //writes reservations name
            Cell bookingNameCell = bookingNameRow.createCell(7);
            bookingNameCell.setCellValue(reservationName.get(idIndex));

            try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demoTicket.xlsx")) {
            workBook.write(outputStream);
        }
    }
}