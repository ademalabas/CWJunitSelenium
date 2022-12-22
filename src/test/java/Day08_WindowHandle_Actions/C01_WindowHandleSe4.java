package Day08_WindowHandle_Actions;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import utilities.BaseTest;

import java.util.Iterator;
import java.util.Set;

public class C01_WindowHandleSe4 extends BaseTest {
    @Override
    public void tearDown() {

    }
    // https://testproject.io/

// https://blog.testproject.io/

    @Test
    public void testWindowHandle() {
        driver.get("https://testproject.io/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://blog.testproject.io/");

    }

@Test
        public void newTab(){

        driver.get("https://testproject.io/");

    WebDriver newTab =driver.switchTo().newWindow(WindowType.WINDOW);

    newTab.get("https//www.amazon.com/");
    driver.getTitle();



        }

@Test
    public void handleWindow(){
        driver.get("https://www.amazon.com/");

        //getwindowhandle()   // getWindowHandles()

    String homePageHandle =driver.getWindowHandle();

    driver.switchTo().newWindow(WindowType.TAB);

    driver.get("https://www.amazon.com.tr/");

    driver.switchTo().newWindow(WindowType.WINDOW);

    driver.get("https://www.google.com/");

   Set<String> handles =driver.getWindowHandles();
    Iterator<String> i = handles.iterator();

    while (i.hasNext()){
        String currentTab = i.next();

        driver.switchTo().window(currentTab);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        //1. yol
        if (!driver.getWindowHandle().equals(homePageHandle)) {
            driver.close();
        }
       /* //2. ypl

        if(!driver.getTitle().contains("Spend")){
            driver.close();
        }

        */



    }




}






    }





