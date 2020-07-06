package com.bookingapp.Service;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CheckAvailableReservations {


    FileInputStream data = new FileInputStream(new File("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(data);
    XSSFSheet sheet = workBook.getSheetAt(1);

    public CheckAvailableReservations() throws IOException {
    }

    public ArrayList reservedIds(){
        List<Double> reservIds = new ArrayList();
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(0);
            reservIds.add(cell.getNumericCellValue());
            //System.out.println(tempReservationIDArray.toString());
        }
        return (ArrayList) reservIds;
    }

    public ArrayList reservedDateStart(){
        List<Double> reservDateStart = new ArrayList();
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(1);
            reservDateStart.add(cell.getNumericCellValue());
            //System.out.println(tempReservationIDArray.toString());
        }
        return (ArrayList) reservDateStart;
    }

    public ArrayList reservedDateEnd(){
        List<Double> reservDateEnd = new ArrayList();
        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum();  rowIndex++){
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(2);
            reservDateEnd.add(cell.getNumericCellValue());
            //System.out.println(tempReservationIDArray.toString());
        }
        return (ArrayList) reservDateEnd;
    }

    //TODO checks 2nd sheet of demo file based on user input(start and end days of reservation). If date is out of already reserved date, then it adds index to the pool, if it's in range, then removes index from the pool


}
