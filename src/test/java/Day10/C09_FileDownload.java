package Day10;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

public class C09_FileDownload extends BaseTest {


    @Override
    public void tearDown() {

    }

    @Test
    public void test() {

        //Go to URL: https://opensource-demo.orangehrmlive.com/
        //Login page valid credentials.
       // Download sample CSV file.
       // Verify if the file downloaded successfully.
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin123" + Keys.ENTER);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();







    }



}
