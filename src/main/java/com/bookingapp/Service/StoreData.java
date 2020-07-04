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

    FileInputStream data = new FileInputStream(new File("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(data);
    XSSFSheet sheet = workBook.getSheetAt(1);


    public void cellCheck() {
        Row checkRow = sheet.getRow(i);
//
        System.out.println(checkRow.getFirstCellNum() + " <first cell num|last cell num> " + checkRow.getLastCellNum());

        for(Row row : sheet) {
            for (Cell cell : checkRow) {
                if(cell.getCellType() != Cell.CELL_TYPE_BLANK){
                    i++;
                    System.out.println(cell.getCellType() == Cell.CELL_TYPE_BLANK);
                    System.out.println("iterration" + i);
                }/*else if(cell.getCellType() == Cell.CELL_TYPE_BLANK){
                    System.out.println("final value " + i);
                    break;
                }*/
                //System.out.println("iterration" + i);
               // i++;
            }
        }
       // while(checkCell.getNumericCellValue() != Cell.CELL_TYPE_BLANK){
       //     i++;
       // }

    }


    public void storeData(double input) throws IOException {

        /*for (c = checkRow.getFirstCellNum(); c < checkRow.getLastCellNum(); c++) {
            checkCell = checkRow.getCell(0);
            if (checkCell.getCellType() != Cell.CELL_TYPE_BLANK) {
                i++;
            }
        }
         */
            System.out.println(i);
            Row reservationID = sheet.createRow(i);
            Cell idCell = reservationID.createCell(0);
            idCell.setCellValue(input);
            try (FileOutputStream outData = new FileOutputStream("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx")) {
                workBook.write(outData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public StoreData() throws IOException {
        }
}



