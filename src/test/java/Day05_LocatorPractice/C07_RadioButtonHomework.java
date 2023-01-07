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

public class C07_RadioButtonHomework {

WebDriver driver;

@Before
    public void setup() {
    WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
}


    @After
    public void tearDown() {
    driver.quit();
    }




    @Test
    public void testRadioButton(){
    //Go to URL: https://demoqa.com/radio-button
//Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
//Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

    driver.get("https://demoqa.com/radio-button");

        WebElement yesbutton = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesbutton.click();
        Assert.assertTrue(!yesbutton.isSelected());

        WebElement impressiveButton = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveButton.click();
        Assert.assertTrue(!impressiveButton.isSelected());

        WebElement noButton = driver.findElement(By.xpath("//label[@for='noRadio']"));
        noButton.click();
        Assert.assertFalse(noButton.isSelected());

        //Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.
        System.out.println(yesbutton.getText());
        System.out.println(impressiveButton.getText());
        System.out.println(noButton.getText());


    }

/*
driver.navigate().to("https://demoqa.com/radio-button");
        List<WebElement> radioLabels = driver.findElements(By.className("custom-control-label"));
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@type='radio']"));
        for (int i = 0; i < radioButtons.size(); i++) {
            radioLabels.get(i).click();
            System.out.println(radioButtons.get(i).isSelected()? "seçildi" : "SEÇİLMEDİ!!!");
            WebElement text = driver.findElement(By.className("text-success"));
            System.out.println("text.getText() = " + text.getText());
        }

 */


}

