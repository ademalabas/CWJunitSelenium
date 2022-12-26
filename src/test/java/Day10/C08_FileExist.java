package Day10;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class C08_FileExist {


@Test

    public void fileExists () {
// C:\Users\hi\Desktop\fileExist.png

    System.out.println("System.getProperty(\"user.home\") = " + System.getProperty("user.home"));
String homePath = System.getProperty("user.home");
String filePath ="\\Desktop\\fileExist.png";
String fullPath = homePath + filePath;
File image = new File(fullPath);
    Assert.assertTrue(image.exists());

}









}
