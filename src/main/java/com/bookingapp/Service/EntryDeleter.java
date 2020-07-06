package com.bookingapp.Service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Component
public class EntryDeleter {

    //TODO deletes reservation entry from available reservations pool

    //FileInputStream file = new FileInputStream(new File("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx"));
    FileInputStream file = new FileInputStream(new File("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(file);
    XSSFSheet sheet = workBook.getSheetAt(0);



    public EntryDeleter() throws IOException {
    }

    public void deleteEntry(int idIndex) throws IOException {
        //
        //Row row = sheet.getRow(idIndex);
        sheet.removeRow(sheet.getRow(idIndex));
        sheet.shiftRows(idIndex+1,sheet.getLastRowNum(),-1);
        //FileOutputStream outData = new FileOutputStream("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx");
        FileOutputStream outData = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx");
        workBook.write(outData);



        System.out.println("index int from deleteEntry >>" + idIndex);



    }


}
