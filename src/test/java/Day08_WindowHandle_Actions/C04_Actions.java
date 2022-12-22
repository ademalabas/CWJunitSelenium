package Day08_WindowHandle_Actions;

import org.junit.Test;
import org.openqa.selenium.AcceptedW3CCapabilityKeys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C04_Actions extends BaseTest {


    @Test
    public void dragAndDropOffset() {
        driver.get("https://rangeslider.js.org/");
        WebElement slider =driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));
        Actions actions =new Actions(driver);

        // saga tasima islemleri icin xoffset +olmali sola tasimai icin - olmali
        // dikey eksende islem olmayacagi icin yoffset ekseni 0 olmali

        actions.dragAndDropBy(slider,20,0).build().perform();






    }




}
