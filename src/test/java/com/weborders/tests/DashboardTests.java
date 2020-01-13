package com.weborders.tests;

import com.weborders.comoon.PageBase;
import com.weborders.comoon.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTests extends TestBase {
    @Test(groups = {"dashboard","regression"})
    public void verifyUsersNameOnDashboardMatches(){

        new LoginPage().login("Tester","test");
        String usersNameOnDashboard=new DashboardPage().getUsersnameFromDashboard();
        Assert.assertTrue(usersNameOnDashboard.contains("Tester"));
    }
    @Test(groups = {"dashboard","regression"})
    public void verifyUserCanLogout(){
        new LoginPage().login("Tester","test");
        new DashboardPage().logOut();
        boolean isLoginButtonDisplayed=new LoginPage().isLoginButtonDisplayed();
        Assert.assertTrue(isLoginButtonDisplayed);
    }
    @Test(groups = {"dashboard","regression"})
    public void verifyDeleteRowFunctionality(){
        new LoginPage().login("Tester","test");
        DashboardPage dashboardPage=new DashboardPage();
        int initialNumberOfRows=dashboardPage.getNumberOfRowsOnTable();
        dashboardPage.deleteFirstRow();
        int finalNumberOfRows=dashboardPage.getNumberOfRowsOnTable();
        Assert.assertEquals(finalNumberOfRows,initialNumberOfRows-1);

    }


}
