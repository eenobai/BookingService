package com.bookingapp.Unused;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.*;


public class StoreData {

    private int i = 0;

    FileInputStream data = new FileInputStream(new File("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx"));
    //FileInputStream data = new FileInputStream(new File("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(data);
    XSSFSheet sheet = workBook.getSheetAt(1);


    public int cellCheck() {
        int c = 0;
        Row row = sheet.getRow(c);
        Cell cell = row.getCell(0);

        while(cell.getCellType() != Cell.CELL_TYPE_STRING){
            i++;
            System.out.println(cell.getCellType());
        }

        /*for(c = 0; cell.getCellType() != Cell.CELL_TYPE_NUMERIC; c++) {
            i++;
            System.out.println("storedata itterator" + i);
        }*/
        //TODO doesnt work anymore?
        return i;
    }


    public void storeData(double idInput,int reservationDateStart, int reservationDateEnd, int cellChecker) throws IOException {

            System.out.println("storeData() cellChecker input -> " + cellChecker);
            Row row = sheet.createRow(cellChecker);
            Cell cellId = row.createCell(0);
            cellId.setCellValue(idInput);
            Cell cellDateStart = row.createCell(1);
            cellDateStart.setCellValue(reservationDateStart);
            Cell cellDateEnd = row.createCell(2);
            cellDateEnd.setCellValue(reservationDateEnd);
            try (FileOutputStream outData = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx")) {
                workBook.write(outData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public StoreData() throws IOException {
        }
}



