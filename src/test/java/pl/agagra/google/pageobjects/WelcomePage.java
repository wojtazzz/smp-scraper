package pl.agagra.google.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Wojtas on 08.07.14.
 */
public class WelcomePage extends Page{

    By loginButton = By.xpath("//*[@id=\"signInInstitutional\"]");
    By ukButton = By.xpath("/html/body/div/table/tbody/tr[1]/td[2]/div[2]/form/div[1]/div[1]/div[2]/ul/li[11]/a");
    By checkboxConditions = By.id("cbCertify");
    By checkboxCookie = By.id("cookie_accept");
    By confirmButton = By.xpath("//*[@id=\"btnSubmit\"]");

    public WelcomePage(WebDriver driver) {
        super(driver);
    }


    public void gotoHomePage(){
        driver.findElement(loginButton).click();
        waitForElementVisible(ukButton,5);
        driver.findElement(ukButton).click();
        waitForElementVisible(checkboxConditions,5);
        driver.findElement(checkboxConditions).click();
        driver.findElement(checkboxCookie).click();
        driver.findElement(confirmButton).click();

    }



}
