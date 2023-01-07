package Day03_Xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //sayfamizin yuklenmesi beklendi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //LinkedIn sitesine gidildi
        driver.get("https://www.linkedin.com");
        // driver imiz maximize edildi

        driver.manage().window().maximize();


    }

    @After
    public void tearDown() {

        // driver imiz kapatildi
        // driver.quit();

    }

@Test
    public void multipleXpath(){
    // xpath locator -->//input[@id='session_key']
    WebElement email = driver.findElement(By.xpath("//input[@class='input__input'][@name='session_key']"));
    email.sendKeys("Adem multiple xpath kavramini kavradi");

}


    @Test
    public void andOrXpath(){
        // xpath locator -->//input[@id='session_key']
        WebElement email = driver.findElement(By.xpath("//input[@class='input__input'and @name='session_key']"));
        email.sendKeys("Adem multiple xpath kavramini kavradi");
    }

    @Test
    public void OrXpath(){
        // xpath locator -->///input[@id='session_key' or @id = 'session_password']
        WebElement email = driver.findElement(By.xpath("//input[@id='session_key' or @id = 'session_password']"));
        email.sendKeys("Adem multiple xpath kavramini kavradi");
    }


    @Test
    public void Dynamicpath(){
        // xpath locator -->///*[contains(@id,'session_key')]
        WebElement email = driver.findElement(By.xpath("//input[contains(@id,'session_key')]"));
        email.sendKeys("Adem multiple xpath kavramini kavradi");

    }

    @Test
    public void startWithpath(){
        // xpath locator -->////input[starts-with(@id,'session')]
        WebElement email = driver.findElement(By.xpath("//input[starts-with(@id,'session')]"));
        email.sendKeys("Adem multiple xpath kavramini kavradi");

    }

    @Test
    public void textXpath(){
        // xpath locator -->////button[contains(text(),'Sign in')]
        WebElement email = driver.findElement(By.xpath("//button[contains(text(),'Sign in')]"));
        email.sendKeys("Adem multiple xpath kavramini kavradi");

    }
    @Test
    public void textNoktaliXpath(){
        // xpath locator -->////button[contains(text(),'Sign in')]
        WebElement email = driver.findElement(By.xpath("//button[contains(. ,'Sign in')]"));
        email.sendKeys("Adem multiple xpath kavramini kavradi");

    }

}
