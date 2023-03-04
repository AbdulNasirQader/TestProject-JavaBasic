package Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReaderDemo2 {
    public static void main(String[] args) throws IOException {

           /*
        Location of File on the computer
         */
        String path="Files/Book1.xlsx";

        // Navigating to the file
        FileInputStream fileInputStream=new FileInputStream(path);

        /*
        It's a class that know how to read and write data to an Excel file
         */
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        //from the Excel file we need to get the sheet first using below method
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
        /*
        getPhysicalNumberOfRows()
        it returns the nof shows that actually contain the dat in Excel file
         */
        int noOfRows=sheet1.getPhysicalNumberOfRows();
        /*
        we need one loop to go through all the rows one by one
         */
        for (int i = 0; i < noOfRows; i++) {
            Row row=sheet1.getRow(i);

            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                Cell cell=row.getCell(j);
                System.out.print(cell+" ");
            }
            System.out.println();

        }
    }
}
