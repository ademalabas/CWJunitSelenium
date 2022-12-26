package Day10;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C07_FileExist {

    public static void main(String[] args) {


        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));// projenin yolunu8 verir
        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));// projenin yolunu8 verir
   String projectRoot =System.getProperty("user.dir");
   String filePath ="src/test/java/resources/fileExist.jpg" ;
   filePath =projectRoot +filePath;
        Files.exists(Paths.get(filePath));


        if (Files.exists(Paths.get(filePath))){
            System.out.println("Dosya bulundu"); // Varsa bulundu yazdirdik
        }else{
            System.out.println("Dosya bulunamadi"); // Yoksa bulunamadi yazdirdik
        }







    }



}
