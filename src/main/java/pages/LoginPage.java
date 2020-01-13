package pages;

import com.weborders.comoon.Base;
import com.weborders.comoon.Driver;
import org.openqa.selenium.By;

public class LoginPage extends Base {
    private String pageUrl="http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx";
    private By userNameLocator=By.id("ctl00_MainContent_username");
    private By passwordLocator=By.id("ctl00_MainContent_password");
    private By loginButtonLocator=By.id("ctl00_MainContent_login_button");
    private By getErrorMessage=By.id("ctl00_MainContent_status");

    public void goToPage(){
       seleniumUtil.goToWebsite(pageUrl);
    }
    public void enterUsrname(String username){
        //Driver.getDriver().findElement(userNameLocator).sendKeys(username);
        seleniumUtil.sendKeys(userNameLocator,username);
    }
    public void enterPassword(String password){
        //Driver.getDriver().findElement(enterPassword).sendKeys(password);
        seleniumUtil.sendKeys(passwordLocator,password);
    }
    public void clickLoginButton(){
        //Driver.getDriver().findElement(loginButtonLocator).click();
        seleniumUtil.click(loginButtonLocator);
    }
    public String getErrorMessageText(){
       // return Driver.getDriver().findElement(getErrorMessage).getText();
        return seleniumUtil.findElement(getErrorMessage).getText();
    }
    public void login(String username,String password){
        goToPage();
        enterUsrname(username);
        enterPassword(password);
        clickLoginButton();
    }
    public boolean isLoginButtonDisplayed(){
        /*boolean result=Driver.getDriver().findElement(loginButtonLocator).isDisplayed();
        return result;*/
        return seleniumUtil.isdisplayed(loginButtonLocator);
    }
}
