package Day05_LocatorPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task01 {

    //https://www.teknosa.com/ adresine gidiniz.
// Arama çubuğuna ''oppo'’ yazıp ENTER tıklayınız.
// Sonuç sayısını yazdırınız.
// Çıkan ilk ürüne tıklayınız.
// Sepete ekleyiniz.
// Sepetime gite tıklayınız.
// Konsolda "Sipariş Özeti" WebElement'inin text'ini yazdırınız.
// Alışverişi tamamlayınız.
// Son olarak "Teknosa'ya Hoş Geldiniz" WebElement'inin text'ini yazdırınız.
// Driver'ı kapatınız.


    WebDriver driver;
    @Test
    public void teknosaTest() {
        driver.get("https://www.teknosa.com/");

        // teknosa sitesine gidildi
        WebElement aramaAlani =driver.findElement(By.name("s"));// name='s'
        aramaAlani.sendKeys("oppo" + Keys.ENTER);
        //
        WebElement sonucSayisi =driver.findElement(By.className("plp-info"));
        System.out.println("sonucSayisi.getText() = " + sonucSayisi.getText());


        //
        WebElement ilkUrun =driver.findElement(By.className("prd-link"));
        ilkUrun.click();

        // sepete ekle butonu tiklandi
        WebElement sepeteEkle =driver.findElement(By.xpath("(//button[@id='addToCartButton'])[1]"));
        sepeteEkle.click();

        //Sepete git butonuna tiklandi
        WebElement sepeteGitButton = driver.findElement(By.xpath("//a[@class='btn btn-secondary']"));
        sepeteGitButton.click();

        // sparis ozeti texti yazdirildi
        WebElement sparisOzeti = driver.findElement(By.xpath("//div[@class='cart-sum-body']"));
        System.out.println("sparisOzeti.getText() = " + sparisOzeti.getText());

        // Alisverisi Tamamla butonuna basildi
        WebElement alisVerisTamamlaButton = driver.findElement(By.partialLinkText("Alışverişi Tamamla"));
        alisVerisTamamlaButton.click();
        // Teknossya Hos geldiniz yazisi yazdirildi
        WebElement hosGeldiniz = driver.findElement(By.xpath("//div[@class='lrp-title']"));
        System.out.println("hosGeldiniz.getText() = " + hosGeldiniz.getText());
    }

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
       // driver.quit();
    }


}