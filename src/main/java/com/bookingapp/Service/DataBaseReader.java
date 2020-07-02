package com.bookingapp.Service;

import com.bookingapp.GettersNSetters.Reservation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;



@Component
public class DataBaseReader {

    FileInputStream data = new FileInputStream(new File("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(data);
    XSSFSheet sheet = workBook.getSheetAt(0);

    public DataBaseReader() throws IOException {
    }

    public ArrayList idReader(){
        List<Double> tempReservationIDArray= new ArrayList();
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(0);
            tempReservationIDArray.add(cell.getNumericCellValue());
            //System.out.println(tempReservationIDArray.toString());
        }
        return (ArrayList) tempReservationIDArray;
    }

    public ArrayList nameReader(){
        List<String> tempReservationNameArray = new ArrayList();
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(1);
            tempReservationNameArray.add(cell.getStringCellValue());
        }
        return (ArrayList) tempReservationNameArray;
    }

    public ArrayList locationReader() {
        List<String> tempReservationLocationArray = new ArrayList();
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(2);
            tempReservationLocationArray.add(cell.getStringCellValue());
        }
        return (ArrayList) tempReservationLocationArray;
    }


}