package Day04_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Practice {
    //Navigate to website  https://testpages.herokuapp.com/styled/index.html
// Under the ORIGINAL CONTENTS
// Click on Alerts
// Print the URL
// Navigate back
// Print the URL
// Click on Basic Ajax
// Print the URL
// Enter value  20 and Enter
// And then verify Submitted Values is displayed open page
// Close driver.


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
    driver.quit();
}
@Test
    public void test(){
    driver.get("https://testpages.herokuapp.com/styled/index.html");
    WebElement alertsLink = driver.findElement(By.xpath("//a[@id='alerts']"));
    alertsLink.click();
    
    // current  URL yazdirma
    String alertsUrl = driver.getCurrentUrl();
    System.out.println(" current alertsUrl = " + alertsUrl);
    
    // navigate back bir sayfa geri gelindi
    driver.navigate().back();
    
    // tekrar url yazdir
    String homeUrl = driver.getCurrentUrl();
    System.out.println("homeUrl = " + homeUrl);

    // Basic ajac link git ve tiklandi
    WebElement basicAjaxLink = driver.findElement(By.id("basicajax"));
    basicAjaxLink.click();

    // print the URL link
    String basicAjaxUrl = driver.getCurrentUrl();
    System.out.println("basicAjaxUrl = " + basicAjaxUrl);

    // text alanina 20 yazilip ENTER a basildi
    driver.findElement(By.id("Lteq30")).sendKeys("20" + Keys.ENTER);


    // Submitted Values yaziosinin goruntulendigini dogrula
    WebElement submittedValuesText = driver.findElement(By.xpath("//p[text()='Submitted Values']"));
    Assert.assertTrue(submittedValuesText.isDisplayed());





}


}
