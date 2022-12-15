package Day02_WebElementLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiersOrPrimitiveType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Locators {
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
    public void idLocator() {
        //id locator -->session_key
        WebElement email = driver.findElement(By.id("session_key"));
        email.sendKeys("ClarusWay selenium dersinden selamlar");

    }

    @Test
    public void nameLocator() {
        //name locator -->session_password
        WebElement password = driver.findElement(By.name("session_password"));
        password.sendKeys("ebikgabik");

    }

    @Test
    public void classLocator() {
        //class locator -->input__input
        WebElement email = driver.findElement(By.className("input__input"));
        email.sendKeys("Class locator Test");
    }

    @Test
    public void tagLocator() {
        //tag locator -->input
        List<WebElement> emaillist = driver.findElements(By.tagName("input"));
        WebElement email = emaillist.get(1);
        email.sendKeys("Tag locator Test");
    }

    @Test
    public void LinlTestLocator() {
        // link test locator -->forgot-password
        WebElement forgotPSWd = driver.findElement(By.linkText("forgot password?"));
        forgotPSWd.click();

    }

    @Test
    public void partiallinkTextLocator() {
        // link test locator -->forgot-password

        WebElement partialPswd = driver.findElement(By.partialLinkText("Forgot"));
        partialPswd.click();
    }

    @Test
    public void absoluteXpath() {
        WebElement email = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/form/div[2]/div[1]/input"));
        email.sendKeys("Adem absolute xpath kavramini kavradi");
    }
    @Test
    public void relativeXpath() {
        // xpath locator -->//input[@id='session_key']
        WebElement email = driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
        email.sendKeys("Adem relative xpath kavramini kavradi");
    }

}
