package Day10_Files;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;


public class C01_ExcelMethods {


    public static void main(String[] args) throws IOException {

        // EDxcell dosyamizin pathini aldik
        String path ="src\\test\\java\\resources\\excelfile.xlsx";

        // Dosyamizi actik
        FileInputStream fileInputStream = new FileInputStream(path);

        // Actigimiz dosyayi excell workbooku na cevidik
        Workbook workbook = WorkbookFactory.create(fileInputStream);

       // workbookumuzdan sheetimize gecis yaptik
        Sheet sheet1 =workbook.getSheetAt(0);

       // Sheetimizde istedigiomiz satiri aldik index 0 dan baslar
        Row row1 = sheet1.getRow(0);

        // satirimizda istedigiomiz hucreyi aldik index 0 dan baslar
        Cell cell1 = row1.getCell(0);

        // Hucremizde string operasyonlari gerceklestimek istersekk toString() metodu kullanarak
        // istenilen islemler yapilir
        System.out.println("cell1 = " + cell1.toString().toLowerCase());


    }



}
