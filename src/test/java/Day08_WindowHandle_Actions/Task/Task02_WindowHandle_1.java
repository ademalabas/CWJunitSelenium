package Day08_WindowHandle_Actions.Task;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

public class Task02_WindowHandle_1 extends BaseTest {



    @Test
    public void windowHandle1 (){
       // Go to URL: https://testproject.io/
        driver.get("https://testproject.io/");

       // Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.

        WebDriver newWindow =driver.switchTo().newWindow(WindowType.WINDOW);

        //   https://blog.testproject.io/
        newWindow.get("https://blog.testproject.io/");




    }





}
