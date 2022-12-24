package Day09_JSEScroll_Cookies_Files.Task;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.BaseTest;

import java.util.Set;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.c;

public class Task02_Cookies extends BaseTest {
    @Override
    public void tearDown() {
    }
    /*
    Go to URL: http://facebook.com
getCookies,
addCookie,
deleteCookieNamed,
deleteAllCookies.
     */

@Test
    public void testCookies(){

   // Go to URL: http://facebook.com
    driver.get("http://facebook.com");

   // getCookies,
    System.out.println("Get current cookies");
    Set<Cookie>  currentCookies =driver.manage().getCookies();
    int currentCookiesCount = currentCookies.size();
    System.out.println("currentCookiesCount = " + currentCookiesCount);// 4

    //  addCookie,
    Cookie cookieSocial = new Cookie("SocialMedia","Instegram");
    Cookie cookieQuote = new Cookie("Quote","ebikgabik");
    Cookie cookiePlayer = new Cookie("Player","Messi");
    driver.manage().addCookie(cookieSocial);
    driver.manage().addCookie(cookieQuote);
    driver.manage().addCookie(cookiePlayer);
    Assert.assertEquals("Trhere is no new cookies", cookieSocial.getValue(),driver.manage().getCookieNamed(cookieSocial.getName()).getValue());//passed
    Assert.assertEquals("Trhere is no new cookies", cookieQuote.getValue(),driver.manage().getCookieNamed(cookieQuote.getName()).getValue());// passed
    Assert.assertEquals("Trhere is no new cookies", cookiePlayer.getValue(),driver.manage().getCookieNamed(cookiePlayer.getName()).getValue());// passed
    currentCookies = driver.manage().getCookies();
    System.out.println("added currentCookies.size() = " + currentCookies.size());//7


    //  deleteCookieNamed,
    driver.manage().deleteCookie(cookiePlayer);
    driver.manage().deleteCookie(cookieQuote);
    Assert.assertNull("cookie halen var",driver.manage().getCookieNamed(cookiePlayer.getName()));//passed
    Assert.assertNull("cookie halen var",driver.manage().getCookieNamed(cookieQuote.getName()));// passed
    currentCookies = driver.manage().getCookies();
    System.out.println("delete currentCookies.size() = " + currentCookies.size());//5

    //  deleteAllCookies.
    driver.manage().deleteAllCookies();
    currentCookies =driver.manage().getCookies();
    System.out.println("delete all currentCookies.size() = " + currentCookies.size());//0


}




}
