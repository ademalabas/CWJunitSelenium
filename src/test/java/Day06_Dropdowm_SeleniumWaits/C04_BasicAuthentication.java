package Day06_Dropdowm_SeleniumWaits;

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

public class C04_BasicAuthentication {



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
    public void basicAut() {

        //Syntax: driver.get("https://USERNAME:PASSWORD@URL");

        //"https://USERNAME:PASSWORD@URL

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement content =driver.findElement(By.id("content"));
        Assert.assertTrue(content.getText().contains("Congratulations"));

        //Assert.assertTrue(driver.findElement(By.xpath("//div[@id='content']")).isDisplayed());


    }




}
