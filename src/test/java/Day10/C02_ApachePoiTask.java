package Day10;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ApachePoiTask {

@Test
    public  void apacheTask() throws IOException {

    /*
    Add the excel file on the resources folder.
Open the file.
Open the workbook using file input stream.
Open the first worksheet.
Go to first row.
Go to first cell on that first row and print.
Go to second cell on that first row and print.
Go to 2nd row first cell and assert if the data equal to Russia.
Go to 3rd row 2nd cell-chain the row and cell.
Find the number of used row.
Print country, area key value pairs as map object.
     */

        // EDxcell dosyamizin pathini aldik
        String path ="src\\test\\java\\resources\\excelfile.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);


        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet1 =workbook.getSheetAt(0);

        Row row1 = sheet1.getRow(0);
        Cell row1cell1 = row1.getCell(0);
            System.out.println("row1cell1 = " + row1cell1);

    Cell row1cell2 = row1.getCell(1);
    System.out.println("row1cell2 = " + row1cell2);


}


}
