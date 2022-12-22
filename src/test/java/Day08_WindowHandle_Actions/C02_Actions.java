package Day08_WindowHandle_Actions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C02_Actions extends BaseTest {


    @Test
    public void doubleclick() {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleclick =driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(doubleclick).perform();

        Assert.assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

    }

    @Test
    public void rigthclick() {
        driver.get("https://demoqa.com/buttons");
        WebElement rightleclick =driver.findElement(By.id("rightClickBtn"));
        Actions actions = new Actions(driver);
        actions.contextClick(rightleclick).build().perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));

        Assert.assertTrue(rightClickMessage.isDisplayed());

    }

    @Test
    public void click() {

            driver.get("https://demoqa.com/buttons");
            WebElement clickBtn =driver.findElement(By.xpath("//button[.='Click Me']"));
            Actions actions = new Actions(driver);
            actions.click(clickBtn).build().perform();
            WebElement dynamicClickMessage =driver.findElement(By.id("dynamicClickMessage"));
            Assert.assertTrue(dynamicClickMessage.isDisplayed());




    }


}
