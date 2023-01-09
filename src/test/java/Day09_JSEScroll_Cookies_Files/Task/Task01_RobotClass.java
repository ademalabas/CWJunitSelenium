package Day09_JSEScroll_Cookies_Files.Task;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Task01_RobotClass extends BaseTest {



   /* https://api.jquery.com/ sitesine gidelim
    arama alanina json yazalim
    Enter islemini robot class kullanrak yapalim
*/



    @Test
    public void testRobotClass() throws AWTException {

        //https://api.jquery.com/ sitesine gidelim
        driver.get("https://api.jquery.com/");


        //arama alanina json yazalim
        WebElement search = driver.findElement(By.name("s"));
        search.sendKeys("json");


        // Enter islemini robot class kullanrak yapalim
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);









    }





}
