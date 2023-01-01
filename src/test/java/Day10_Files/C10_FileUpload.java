package Day10_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C10_FileUpload extends BaseTest {


    @Test
    public void FileUploadTest()  {

/*
Go to URL: https://the-internet.herokuapp.com/upload
Find the path of the file that you want to upload.
Click on Upload button.
Verify the upload message.

 */ driver.get("https://the-internet.herokuapp.com/upload");

        //Upload edilecek dosyamizi seciyoruz
        WebElement dosyaSec = driver.findElement(By.id("file-upload"));
        dosyaSec.sendKeys("C:\\Users\\hi\\Desktop\\fileExist.png");

        // Upload butonuna basiyoruz
        WebElement uploadFile = driver.findElement(By.id("file-submit"));
        uploadFile.click();


        // Upload edilme mesajinin goruntulendigini dogruluyoruz
        WebElement uploadedMessage = driver.findElement(By.tagName("h3"));

       //List< WebElement> uploadedMessage = driver.findElements(By.tagName("h3"));
        //Boolean isPresent = driver.findElements().size() > 0
        Assert.assertTrue(uploadedMessage.isDisplayed());

        Assert.assertEquals("File Uploaded!" ,uploadedMessage.getText());



    }




}
