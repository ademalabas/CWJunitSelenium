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
import java.util.List;

public class C06_RadioButtons {

//    Go to URL:  https://www.facebook.com/
//    Click on Create an Account button.
//    Then click erkek button the radio buttons.

    //Validate the kadin is not selected


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
    public void radiobuttons() {
        //
      driver.get("https://www.facebook.com/");
        WebElement registerbutton = driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]"));
      registerbutton.click();

        WebElement kadinRadio = driver.findElement(By.xpath("//input[@name='sex' and @value='1']"));
        WebElement erkekRadio = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));

        kadinRadio.click();

        erkekRadio.click();

        Assert.assertTrue(erkekRadio.isSelected());
        Assert.assertTrue(!kadinRadio.isSelected());




    }

   /* @Test
    public void test(){
        WebElement newAcc = driver.findElement(By.xpath("//a[@id='u_0_0_d6']"));
        newAcc.click();

        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@class='_8esa']"));
        radioButtons.get(0).click();
        Assert.assertTrue(radioButtons.get(0).isSelected());
        Assert.assertFalse(radioButtons.get(1).isSelected());
        Assert.assertFalse(radioButtons.get(2).isSelected());

        radioButtons.get(1).click();
        Assert.assertTrue(radioButtons.get(1).isSelected());
        Assert.assertFalse(radioButtons.get(0).isSelected());
        Assert.assertFalse(radioButtons.get(2).isSelected());

        radioButtons.get(2).click();
        Assert.assertTrue(radioButtons.get(2).isSelected());
        Assert.assertFalse(radioButtons.get(0).isSelected());
        Assert.assertFalse(radioButtons.get(1).isSelected());
    }

*/



    }


