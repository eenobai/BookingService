package com.bookingapp.Service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class StoreData {

    private int i = 0;

    FileInputStream data = new FileInputStream(new File("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(data);
    XSSFSheet sheet = workBook.getSheetAt(1);


    public int cellCheck() {
        int c = 0;
        Row row = sheet.getRow(c);
        Cell cell = row.getCell(0);
//
        //System.out.println(row.getFirstCellNum() + " <first cell num|last cell num> " + row.getLastCellNum());

        for(c = 0; cell.getCellType() != Cell.CELL_TYPE_BLANK; c++) {
            i++;
            System.out.println("storedata itterator" + i);
        }
        //TODO doesnt work anymore?
        return i;
    }


    public void storeData(double input, int cellChecker) throws IOException {

            System.out.println(cellChecker);
            Row row = sheet.createRow(cellChecker);
            Cell cell = row.createCell(0);
            cell.setCellValue(input);
            try (FileOutputStream outData = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx")) {
                workBook.write(outData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public StoreData() throws IOException {
        }
}



