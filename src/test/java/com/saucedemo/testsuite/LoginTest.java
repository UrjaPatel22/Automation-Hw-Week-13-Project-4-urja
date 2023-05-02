package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

LoginPage loginpage = new LoginPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        loginpage.enterEmailId("standard_user");
        loginpage.enterPassword("secret_sauce");
        loginpage.clickOnLoginButton();
        String expectedMessage= "Products";
        String actualMessage=loginpage.successfulProductDisplayed();
        Assert.assertEquals(actualMessage,expectedMessage,"Product Not Displayed");


    }
@Test
   public void  verifyThatSixProductsAreDisplayedOnPage(){
    loginpage.enterEmailId("standard_user");
    loginpage.enterPassword("secret_sauce");
    loginpage.clickOnLoginButton();
    String expectedNumberOfProducts = "6";
    String actualNumberOfProducts = String.valueOf(loginpage.countProductOnList());
    Assert.assertEquals(actualNumberOfProducts,expectedNumberOfProducts,"total number of products are not displayed");


}

}
