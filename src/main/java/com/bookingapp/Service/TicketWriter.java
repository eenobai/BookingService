package com.bookingapp.Service;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.bookingapp.GettersNSetters.Reservation;

@Component
public class TicketWriter {


    public void ticketWriter() throws IOException {
        XSSFWorkbook workBook = new XSSFWorkbook();
        XSSFSheet sheet = workBook.createSheet("Reservation Ticket");

        Reservation reservation = new Reservation();

            Row nameRow = sheet.createRow(2);
            Cell nameCell = nameRow.createCell(2);
            nameCell.setCellValue(reservation.getName());

            Row sureNameRow = sheet.getRow(2);
            Cell sureNameCell = sureNameRow.createCell(3);
            sureNameCell.setCellValue(reservation.getSureName());

            Row idRow = sheet.getRow(2);
            Cell idCell = idRow.createCell(7);
            idCell.setCellValue((Double) reservation.getIDArray().get(reservation.tempReservationIDArray.indexOf(reservation.reservationID)));

            Row reservationStartRow = sheet.createRow(7);
            Cell reservationStartCell = reservationStartRow.createCell(2);
            reservationStartCell.setCellValue(reservation.getReservationDateStart());
            reservationStartCell.setCellValue((String) reservation.getNameArray().get(reservation.tempReservationNameArray.indexOf(reservation.reservationName)));

            Row reservationEndRow = sheet.getRow(7);
            Cell reservationEndCell = reservationEndRow.createCell(3);
            reservationEndCell.setCellValue(reservation.getReservationDateEnd());



        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demoTicket.xlsx")) {
            workBook.write(outputStream);
        }
    }

}