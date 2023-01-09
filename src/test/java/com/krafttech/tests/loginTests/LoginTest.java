package com.krafttech.tests.loginTests;

import com.krafttech.pages.DashboardPage;
import com.krafttech.pages.LoginPages;
import com.krafttech.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPages loginPages=new LoginPages();
    DashboardPage dashboardPage=new DashboardPage();

    @Test
    public void loginTest1(){
        loginPages.loginUser();

        String expectedPageTitle="Dashboard";
        String actualPageTitle=dashboardPage.dashboardPageTitle_loc.getText();

        Assert.assertEquals(actualPageTitle,expectedPageTitle,"verify that the titles are same");
    }
}
