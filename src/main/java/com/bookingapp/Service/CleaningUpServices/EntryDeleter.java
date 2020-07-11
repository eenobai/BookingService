package com.bookingapp.Service.CleaningUpServices;

import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//TODO this one is pointless at this point

@Component
public class EntryDeleter {

    //TODO deletes reservation entry from available reservations pool

    //FileInputStream file = new FileInputStream(new File(".resources/demo.xlsx"));
    FileInputStream file = new FileInputStream(new File("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(file);
    XSSFSheet sheet = workBook.getSheetAt(0);



    public EntryDeleter() throws IOException {
    }

    public void deleteEntry(String locationName, int idIndex) throws IOException {
        int i = 0;


        DataFormatter formatter = new DataFormatter();
        for(Row row : sheet){
            Cell cell = row.getCell(1);
                CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());
                String text = formatter.formatCellValue(cell);

                if (cell.getStringCellValue().equals(locationName)){
                   i = row.getRowNum();

            }
        }

        System.out.println("entry deleter i = " + i);

        sheet.removeRow(sheet.getRow(i));
        sheet.shiftRows(i+1,sheet.getLastRowNum(),-1);
        FileOutputStream outData = new FileOutputStream("C:\\Users\\Ilya\\Desktop\\BookingService\\src\\main\\resources\\demo.xlsx");
        workBook.write(outData);

        System.out.println("index int from deleteEntry >>" + idIndex);

    }


}
