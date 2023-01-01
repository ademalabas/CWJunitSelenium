package Day10_Files;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ExcelMethods {


    public static void main(String[] args) throws IOException {
        // EDxcell dosyamizin pathini aldik
        String path ="src\\test\\java\\resources\\excelfile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 =workbook.getSheetAt(0);

        Row row1 = sheet1.getRow(0);
        Cell cell1 = row1.getCell(0);

        System.out.println("cell1 = " + cell1.toString().toLowerCase());


    }



}
