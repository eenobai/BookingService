package com.bookingapp.Service;
import com.bookingapp.GettersNSetters.Reservation;
import org.springframework.context.*;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TicketWriter {

    private Reservation reservation;

    public void ticketWriter() throws IOException {
        XSSFWorkbook workBook = new XSSFWorkbook();
        XSSFSheet sheet = workBook.createSheet("Reservation Ticket");

        System.out.println("Writer" + reservation.tempReservationIDArray.toString() + reservation.tempReservationNameArray.toString() + reservation.tempReservationLocationArray.toString());

            Row nameRow = sheet.createRow(2); //clients name
            Cell nameCell = nameRow.createCell(2);
            nameCell.setCellValue(reservation.getName());

            Row sureNameRow = sheet.getRow(2); //clients surename
            Cell sureNameCell = sureNameRow.createCell(3);
            sureNameCell.setCellValue(reservation.getSureName());

            Row idRow = sheet.getRow(2);  //booking id
            Cell idCell = idRow.createCell(7);
            idCell.setCellValue((Double) reservation.getIDArray().get(reservation.tempReservationIDArray.indexOf(reservation.reservationID)));

            Row reservationStartRow = sheet.createRow(7);
            Cell reservationStartCell = reservationStartRow.createCell(2);
            reservationStartCell.setCellValue(reservation.getReservationDateStart());

            Row reservationEndRow = sheet.getRow(7);
            Cell reservationEndCell = reservationEndRow.createCell(3);
            reservationEndCell.setCellValue(reservation.getReservationDateEnd());

            //TODO - add Location and Name of the booking


        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demoTicket.xlsx")) {
            workBook.write(outputStream);
        }
    }

}