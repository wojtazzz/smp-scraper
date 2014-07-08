package pl.agagra.google.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {

    protected final WebDriver driver;
    public static final String URL = "www.source.info";


    public Page(WebDriver driver) {
        this.driver = driver;
    }


    protected boolean elementPresent(By locator) {
        return driver.findElements(locator).size() != 0;
    }

    protected boolean elementIsVisible(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    protected void wait(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    protected void waitForElementVisible(final By by, int timeOutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void waitForElementPresent(final By by, int timeOutInSeconds) {
        new WebDriverWait(driver, timeOutInSeconds)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

}
