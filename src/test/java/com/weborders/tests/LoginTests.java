package com.weborders.tests;

import com.weborders.comoon.Driver;
import com.weborders.comoon.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTests extends TestBase {

    @Test(groups = {"login","regression"})
    public void verifyUserCanLoginWithCorrectCredentials(){
        LoginPage loginPage=new LoginPage();
        loginPage.login("Tester","test");
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),
                "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/default.aspx");
    }
    @Test(groups = {"login","regression"})
    public void verifyUserCannotLoginIncorrectCrednetials(){
        LoginPage loginPage=new LoginPage();
        loginPage.login("Tester","qwertyu");
        String errorMessagetext=loginPage.getErrorMessageText();
        Assert.assertEquals(errorMessagetext,"Invalid Login or Password.");
        //Assert.assertTrue(driver.findElement(By.id("ctl00_MainContent_status")).isDisplayed());
    }

}
