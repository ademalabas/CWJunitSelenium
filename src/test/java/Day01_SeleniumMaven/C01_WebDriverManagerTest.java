package Day01_SeleniumMaven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverManagerTest {
// Set Path.
// Create chrome driver.
// Maximize the window.
// Open google home page https://www.google.com/
// Verify that you are Google in the title.

    public static void main(String[] args) {

            // System,setProperty yerine
        // web driver manager clasini kullanarak crome driver binary lerimizi indirdik
        WebDriverManager.chromedriver().setup();

        WebDriver driver =new ChromeDriver();



    }

}
