package Day08_WindowHandle_Actions.Task;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Task03_WindowHandle_2 extends BaseTest {



    @Test
    public void windowHandle2 () {
        //Go to URL: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");
        String homePageId = driver.getWindowHandle();

        // Click on the windows - "WindowButton"
        driver.findElement(By.xpath("//button[@id='windowButton']"));

        // Click on all the child windows.
        driver.findElement(By.xpath("//button[@id='messageWindowButton']"));

        // Print the text present on all the child windows in the console.

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        while (iterator.hasNext()) {
            driver.switchTo().window(iterator.next());
            if (driver.getWindowHandle().equals(homePageId)) {
                continue;
            }
            WebElement text = driver.findElement(By.xpath("//*[text()]"));
            System.out.println("Child text.getText() = " + text.getText());
        }

            // Print the heading of the parent window in the console.
            driver.switchTo().window(homePageId);
            System.out.println("Home page driver.getTitle() = " + driver.getTitle());


        }


    }


