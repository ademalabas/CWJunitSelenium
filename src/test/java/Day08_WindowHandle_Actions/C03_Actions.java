package Day08_WindowHandle_Actions;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.BaseTest;

public class C03_Actions extends BaseTest {


    @Test
    public void dragAndDrop() {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
// drag elements
        WebElement washingrion = driver.findElement(By.id("box3"));
        WebElement copenhagen = driver.findElement(By.id("box4"));
        WebElement seoul = driver.findElement(By.id("box5"));
        WebElement rome = driver.findElement(By.id("box6"));
        WebElement madrid = driver.findElement(By.id("box7"));
        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement stockholm = driver.findElement(By.id("box2"));

     //   drop elements
        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement soutKorea = driver.findElement(By.id("box105"));
        WebElement sweden = driver.findElement(By.id("box102"));
        WebElement us = driver.findElement(By.id("box103"));

        Actions actions =new Actions(driver);
        // tekli kullanim
        actions.dragAndDrop(madrid,spain).build().perform();
        actions.dragAndDrop(washingrion,us).build().perform();
        actions.dragAndDrop(rome,italy).build().perform();
        actions.dragAndDrop(copenhagen,denmark).build().perform();

        //method zinciri seklinde kullanim
        actions.dragAndDrop(seoul,soutKorea)
                .dragAndDrop(oslo,norway)
                .dragAndDrop(stockholm,sweden).build().perform();;






    }



}
