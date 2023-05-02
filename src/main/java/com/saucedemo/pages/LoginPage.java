package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By emailField = By.id("user-name");
    By passwordField = By.name("password");
    By loginButton = By.id("login-button");

    By product =By.xpath("//span[contains(text(),'Products')]") ;



    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String successfulProductDisplayed(){
        return getTextFromElement(product);
    }

    public int countProductOnList() {
        List<WebElement> productsList = driver.findElements(By.className("inventory_item_label"));
        return productsList.size();
    }

}
