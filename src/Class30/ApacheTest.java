package Class30;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ApacheTest {
    public static void main(String[] args) throws IOException {

        String testApache="C:\\Users\\Abdul Nasir Qader\\OneDrive\\Desktop\\Apache POI\\Test.xlsx";
        FileInputStream fileInputStream=new FileInputStream(testApache);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet= xssfWorkbook.getSheet("Sheet1");
        Row row= sheet.getRow(0);
        Row row1= sheet.getRow(1);
        System.out.println(row.getCell(0));
        System.out.println(row1.getCell(1));
    }
}
