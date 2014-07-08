package pl.agagra.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pl.agagra.google.pageobjects.Page;
import pl.agagra.google.pageobjects.WelcomePage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class SmpScraperTest {


    WebDriver driver;

    @BeforeMethod
    public void beforeEveryTest() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("http://" + Page.URL);

    }

    @AfterMethod
    public void afterEveryTest() {
        //driver.quit();
    }

    @Test
    public void scrapeStuff() {
        WelcomePage welcome = new WelcomePage(driver);
        welcome.gotoHomePage();
    }


}
