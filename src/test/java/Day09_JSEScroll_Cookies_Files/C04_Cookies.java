package Day09_JSEScroll_Cookies_Files;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

public class C04_Cookies extends BaseTest {

/*
Go to URL: https://kitchen.applitools.com/ingredients/cookie
Get Cookie.
Find the total number of cookies.
Print all the cookies.
Add Cookie.
Edit Cookie.
Delete Cookie.
Delete All Cookies.
 */

    @Test
    public void testCookies(){
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        System.out.println("Test get cookie");
        Cookie cookie =driver.manage().getCookieNamed("protein");// cookie isimle cagirildi
        Assert.assertEquals("chicken",cookie.getValue());

       // Find the total number of cookies.
        Set<Cookie> allCookies =driver.manage().getCookies();
        int numOfCookies = allCookies.size();
        System.out.println("numOfCookies = " + numOfCookies);// number of cookie 2



        //Print all the cookies.
        for(Cookie each : allCookies){
            System.out.println("each cookie : "+each);
            System.out.println("each cookie name : "+each.getName());
            System.out.println("each cookie value : "+each.getValue());
        }
        //Add Cookie.
        System.out.println("add cookie : ");
        Cookie cookie1 = new Cookie("fruit", "apple");// coolie olusturduk
        driver.manage().addCookie(cookie1);
        Assert.assertEquals("It does not match",cookie1.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());

        allCookies =driver.manage().getCookies(); // guncel cookileri dondurur
        System.out.println("allCookies.size() = " + allCookies.size());// number of cookie 3

        //Edit Cookie.
        System.out.println("edit cookie");
        Cookie editCookie = new Cookie (cookie1.getName(),"mango");
        driver.manage().addCookie(editCookie);
        Assert.assertEquals(editCookie.getValue(),driver.manage().getCookieNamed(cookie1.getName()).getValue());
        System.out.println(driver.manage().getCookieNamed(cookie1.getName()).getValue());// mango

        //Delete Cookie.
        System.out.println("delete cookie");



    }

    @Test
    public void deletecookie() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");
        Set<Cookie> allCookies =driver.manage().getCookies();
        int numOfCookies = allCookies.size();
        System.out.println("numOfCookies = " + numOfCookies);// number of cookie 2




        Cookie adddedCookie = new Cookie("drinks","ayran");// cookie olusturduk
        driver.manage().addCookie(adddedCookie);// cookie ekledik
        allCookies =driver.manage().getCookies(); // guncel cookileri dondurur
        System.out.println("allCookies.size() = " + allCookies.size());// number of cookie 3

        System.out.println("delete cookie");
        driver.manage().deleteCookie(adddedCookie);// cookie sildik
        Assert.assertNull("cookie halen var",driver.manage().getCookieNamed(adddedCookie.getName()));//Passed
        allCookies =driver.manage().getCookies(); // guncel cookileri dondurur
        System.out.println("allCookies.size() = " + allCookies.size());// number of cookie 2

        driver.manage().deleteAllCookies(); //browserdan hepsi sildik
        allCookies = driver.manage().getCookies(); // sayfada var olan cookieleri dondurur
        System.out.println("allCookies = " + allCookies.size()); // allCookies = 0

    }







}
