package Day06_Dropdowm_SeleniumWaits.Tasks;

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

public class Task02_MultiSelect {

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

       // - https://demoqa.com/select-menu sitesine gidin
       // - Multiple select yapabileceginiz <select> elementini locate edin
       // - Birden fazla secim yapip secimlerinizi DOGRULAyin
        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("cars"));
        Select multiSelect =new Select(dropdown);
        System.out.println("multiSelect.isMultiple() = " + multiSelect.isMultiple());
        multiSelect.selectByIndex(0);
        multiSelect.selectByVisibleText("Volvo");
        multiSelect.selectByIndex(2);
        multiSelect.selectByValue("opel");

        multiSelect.getOptions().stream().forEach(t-> System.out.println(t.isSelected()?t.getText() +" = is seleected": t.getText()+"= is not selected"));
      //  multiSelect.getOptions().stream().forEach(t-> System.out.println(t.getText()));
        /*
        multiSelect.isMultiple() = true
        Volvo = is seleected
        Saab= is not selected
        Opel = is seleected
        Audi= is not selected
         */

    }







}
