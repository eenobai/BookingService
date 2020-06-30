package com.bookingapp.Service;
import java.util.ArrayList;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.bookingapp.GettersNSetters.Reservation;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.bookingapp.GettersNSetters.Reservation;

@Component
public class DataBaseReader {

    ArrayList<String> tempReservArrayStr = new ArrayList();

    FileInputStream data = new FileInputStream(new File("C:\\Users\\Pepega\\IdeaProjects\\BookingService\\src\\main\\resources\\demo.xlsx"));
    XSSFWorkbook workBook = new XSSFWorkbook(data);
    XSSFSheet sheet = workBook.getSheetAt(0);
    FormulaEvaluator formulaEvaluator = workBook.getCreationHelper().createFormulaEvaluator();
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
    public void dbReader(){

        Reservation reservation = new Reservation();

        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        reservation.setIDArray(cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_STRING:
                        tempReservArrayStr.add(cell.getStringCellValue());
                        break;
                }
            }
        }

        System.out.println(reservation.tempReservationIDArray.toString() + tempReservArrayStr.toString()); //for testing purposes
    }
    public DataBaseReader() throws IOException {
    }
}