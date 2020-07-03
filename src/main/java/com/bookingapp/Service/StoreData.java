package com.bookingapp.Service;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.*;

@Component
public class StoreData {
        int j = 0;
        int i;

        FileInputStream data = new FileInputStream(new File("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx"));
        XSSFWorkbook workBook = new XSSFWorkbook(data);
        XSSFSheet sheet = workBook.getSheetAt(1);
        Row reservationID = sheet.getRow(i); //clients name
        Cell idCell = reservationID.createCell(0);

        public void cellCheck(){

            if(idCell.getNumericCellValue() != Cell.CELL_TYPE_BLANK){
                i++;
            }

        }


        public void storeData(double input) throws IOException {
            idCell.setCellValue(input);
            try (FileOutputStream outData = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx")) {
                workBook.write(outData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public StoreData() throws IOException {
    }
}


