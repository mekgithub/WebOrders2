package Utils;

import com.weborders.comoon.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumUtil {
    public void goToWebsite(String url){
        Driver.getDriver().get(url);
    }
    public WebElement findElement(By locator){
        return Driver.getDriver().findElement(locator);
    }
    public void sendKeys(By locator,String text){
        findElement(locator).sendKeys(text);
    }
    public void click(By locator){
        findElement(locator).click();
    }
    public String getText(By locator){
        return findElement(locator).getText();
    }

   public boolean isdisplayed(By locator){
        return findElement(locator).isDisplayed();

    }
    public void clear(By locator){
        findElement(locator).clear();
    }
    public List<WebElement> findElements(By locator){
        return Driver.getDriver().findElements(locator);
    }

}
