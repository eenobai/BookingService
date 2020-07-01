package com.bookingapp.Service;

import com.bookingapp.GettersNSetters.Reservation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.context.*;
import org.springframework.stereotype.Component;



@Component
public class DataBaseReader {

    FileInputStream data = new FileInputStream(new File("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(data);
    XSSFSheet sheet = workBook.getSheetAt(0);

    /*
        public DataBaseReader(ArrayList<Integer> tempReservArrayID, ArrayList<String> tempReservArrayStr) throws IOException {
            this.tempReservArrayID = tempReservArrayID;
            this.tempReservArrayStr = tempReservArraySt
        }
        private Object getCellVal(Cell cell){
            cell.getCellType(); {
                if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                    return cell.getNumericCellValue();
                } else {
                    return cell.getStringCellValue();
                }
            }
        }*/

    private Reservation reservation;

    public void dataBaseReader(){


        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(0);
            reservation.setIDArray(cell.getNumericCellValue());
        }
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(1);
            reservation.setNameArray(cell.getStringCellValue());
        }
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(2);
            reservation.setLocationArray(cell.getStringCellValue());
        }

        System.out.println("Reader" + reservation.tempReservationIDArray.toString() + reservation.tempReservationNameArray.toString() + reservation.tempReservationLocationArray.toString());//for testing purposes
    }
    public DataBaseReader() throws IOException {
    }
}