package Class31;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ExcelReaderDemo4 {
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
        var excelData=new ArrayList<>();
        for (int i = 1; i < noOfRows; i++) {
            Row row=sheet1.getRow(i);
            LinkedHashMap rowMap=new LinkedHashMap();
            rowMap.put("Name",row.getCell(0));
            rowMap.put("age",row.getCell(1));
            rowMap.put("City",row.getCell(2));
            rowMap.put("Salary",row.getCell(3));
            excelData.add(rowMap);



        }
    }
}
