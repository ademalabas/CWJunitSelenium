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
        // windowsimuzu maximize ettik
        driver.manage().window().maximize();
        // goog anasayfamizi actik

        driver.get("https://www.google.com/");

        // title imizi indirdik
        String title = driver.getTitle();

        // titlemizi dogruladik
        if (title.equalsIgnoreCase("google")) {
            System.out.println("TITLE TEST PASSED" );
        } else {
            System.out.println("TITLE TEST FAILED" );
        }
        // driverimizi kapattik
        driver.quit();


    }

}
