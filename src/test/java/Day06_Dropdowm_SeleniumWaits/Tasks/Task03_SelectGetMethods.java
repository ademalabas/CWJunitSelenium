package Day06_Dropdowm_SeleniumWaits.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Task03_SelectGetMethods {

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
    public void selectMeth() {
      //- https://demoqa.com/select-menu sitesine gidin
      //  - multiple <select> elementini locate edin
      // - getOptions(), getFirstSelectedOption(), getAllSelected() methodlarini kullanmak adina:
      // * Farkli secimler yaparak methodlarinizi kullanin ve Assertion yapmayi unutmayin

        driver.get("https://demoqa.com/select-menu");
        WebElement dropdown = driver.findElement(By.id("cars"));
        Select selectmethods =new Select(dropdown);
        System.out.println("*** Get Options");
        selectmethods.getOptions().stream().forEach(t-> System.out.println("t.getText() = " + t.getText()));


        System.out.println("*** getFirstSelected ***");
        selectmethods.selectByVisibleText("Opel");
        selectmethods.selectByValue("volvo");// firt selected daha once oldugu ivin secilir


        WebElement selectedoptions= selectmethods.getFirstSelectedOption();
        System.out.println("get first selected = " + selectedoptions.getText());


        System.out.println("*** Get All Selected ***");
        selectmethods.selectByIndex(0);
        selectmethods.selectByValue("opel");

        selectmethods.getAllSelectedOptions().stream().forEach(t-> System.out.println(t.isSelected()?t.getText() +" = is seleected":""));

/*
*** Get Options
t.getText() = Volvo
t.getText() = Saab
t.getText() = Opel
t.getText() = Audi
*** getFirstSelected ***
get first selected = Volvo
*** Get All Selected ***
Volvo = is seleected
Opel = is seleected
 */

    }







}
