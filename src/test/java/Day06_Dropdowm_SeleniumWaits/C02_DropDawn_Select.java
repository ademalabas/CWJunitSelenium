package Day06_Dropdowm_SeleniumWaits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C02_DropDawn_Select {


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
    public void selectByIndex() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        //Dropdown locate edildi
        WebElement dropdown =driver.findElement(By.name("country"));

        //Locate edilen dropdown select objesine donusturuldu
        Select select = new Select(dropdown);
        //selectByIndex() metodu 0 ile baslar.
        select.selectByIndex(1);//ALGERIA



    }


    @Test
    public void selectByValue() {}

    @Test
    public void selectByVisibleText() {}

}
