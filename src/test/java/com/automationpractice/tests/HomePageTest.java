package com.automationpractice.tests;

import com.automationpractice.ScriptBase.ScriptBaseTestNG;
import com.automationpractice.utils.Constants;
import org.testng.annotations.Test;

public class HomePageTest extends ScriptBaseTestNG {

    @Test(groups = {"smoke-test","regression"})
    public void navigateToLoginPage(){
        //test = extent.createTest("navigateToLoginPage", "PASSED test case");
        homePage.verifyPageLogo();
        homePage.navigateToLoginPage();
        homePage.verifyPageTitle(Constants.LOGIN_PAGE_TITLE);
        homePage.isPageReady();
    }

    @Test(groups = {"smoke-test"})
    public void Search(){
        //test = extent.createTest("Search", "PASSED test case");
        homePage.verifyPageLogo();
        homePage.searchFunctionality(randomTestData.randomEmail());
        homePage.verifyNoResultFound();
        homePage.isPageReady();

    }
}
