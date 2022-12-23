package Day08_WindowHandle_Actions.Task;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.List;

public class Task01_Iframe extends BaseTest {


    @Test

    public void Iframe() throws InterruptedException {

        // Go to URL: http://demo.guru99.com/test/guru99home/
        driver.get("http://demo.guru99.com/test/guru99home/");

        // Find the number of iframes on the page.
        List<WebElement> iframesList = driver.findElements(By.xpath("//iframe"));
        System.out.println("iframesList.size() = " + iframesList.size());

        //Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.cssSelector("[src='Jmeter720.png']")).click();

        // Exit the iframe and return to the main page.

        driver.switchTo().defaultContent();
        Thread.sleep(3000);


    }



}
