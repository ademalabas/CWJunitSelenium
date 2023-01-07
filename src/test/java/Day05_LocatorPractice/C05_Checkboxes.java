package Day05_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Checkboxes {

    WebDriver driver;

    @Before
    public void setUp() {
        // Driver ile ilgili her  turlu initial baslangic isimleri burada yapilir
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        // test sonrasinda driver kapatacak (varsa raporlari dosyalamak) icin kullanilir
        //  driver.quit();
    }


    @Test
    public void checkboxes() {

//    Go to URL: https://demoqa.com/
//    Click on Elements.
//    Click on Checkbox.
//    Verify if Home checkbox is selected.
//    Verify that "You have selected" is visible.


        //    Go to URL: https://demoqa.com/
        driver.get("https://demoqa.com/");

       // Click on Elements.
        WebElement elementButton = driver.findElement(By.xpath("(//div[@class='card mt-4 top-card'])[1]"));
        elementButton.click();

        //    Click on Checkbox.
        WebElement checkboxButton = driver.findElement(By.xpath("(//span[@class='text'])[2]"));
        checkboxButton.click();

        //    Verify if Home checkbox is selected.
        WebElement homecheckbox = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        if (!homecheckbox.isSelected()){homecheckbox.click();}
        Assert.assertTrue(homecheckbox.isDisplayed());

        //Verify that "You have selected" is visible.
        WebElement selected = driver.findElement(By.id("result"));
        Assert.assertTrue(selected.isDisplayed());






    }

}
