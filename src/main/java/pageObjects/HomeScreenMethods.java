package main.java.pageObjects;

import main.java.pageElements.HomeScreenElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import test.java.BaseTest;

public class HomeScreenMethods extends HomeScreenElements{

    public boolean verifyHomeScreen(){
        Boolean flag;
        if(BaseTest.driver.findElement(signInButton1).isDisplayed()){
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    public void clickLoginIconOnHome(){
        BaseTest.driver.findElement(signInButton1).click();
    }


}
