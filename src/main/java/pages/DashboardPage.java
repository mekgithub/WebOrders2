package pages;

import com.weborders.comoon.Driver;
import com.weborders.comoon.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DashboardPage extends PageBase {
    private By usersNameLocator=By.cssSelector(".login_info");
    private By logoutLinkLocator=By.linkText("Logout");
    private By firstCheckboxLocator=By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector");
    private By deleteButtonLocator=By.id("ctl00_MainContent_btnDelete");
    private By tableRowLocator=By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td/..");


    public String getUsersnameFromDashboard(){
        String text= Driver.getDriver().findElement(usersNameLocator).getText();
        return text;
    }
    public void logOut(){
        Driver.getDriver().findElement(logoutLinkLocator).click();
    }
    public void checkFirstCheckBox(){
        seleniumUtil.click(firstCheckboxLocator);
    }
    public void clickDeleteButton(){
        seleniumUtil.click(deleteButtonLocator);
    }
    public int getNumberOfRowsOnTable(){
       return seleniumUtil.findElements(tableRowLocator).size();
    }
    public void deleteFirstRow(){
        checkFirstCheckBox();
        clickDeleteButton();
    }



   @Override
    public void waitForPageToLoad() {
    }
}
