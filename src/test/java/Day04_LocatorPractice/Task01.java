package Day04_LocatorPractice;

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

public class Task01 {
//https://id.heroku.com/login sayfasına gidiniz.
//Bir mail adresi giriniz.
//Bir password giriniz.
//Login butonuna tıklayınız.
//"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
//Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
//Tüm sayfaları kapatınız.


    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager .chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
       // driver.quit();
    }
    @Test
    public void Homework01(){
        driver.get("https://id.heroku.com/login");



        //Bir mail adresi giriniz.
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys(" itopdas@gmail.com");

        //Bir password giriniz.
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("4765900");

        //Login butonuna tıklayınız.
        WebElement logIn = driver.findElement(By.xpath("//button[@value='Log In']"));
        logIn.click();
//"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.

        WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
        Assert.assertTrue(alert.isDisplayed());
        Assert.assertTrue("Kayit Fonksiyonu duzgun calismiyor",alert.getText().contains("There was a problem with your login."));

    }


    }






