package main.java.pageObjects;

import com.sun.org.apache.xpath.internal.operations.Bool;
import main.java.pageElements.LoginScreenElements;
import test.java.BaseTest;

public class LoginScreenMethods extends LoginScreenElements {
//    HomeScreenMethods homeScreenMethods = new HomeScreenMethods();


//        homeScreenMethods.verifyHomeScreen();

    public boolean voidEnterLoginCredentials(String uname, String pass){
        Boolean flag;
        BaseTest.driver.findElement(email).sendKeys(uname);
        BaseTest.driver.findElement(continueButton).click();
        BaseTest.driver.findElement(password).sendKeys(pass);
        BaseTest.driver.findElement(signInButton).click();

        if(BaseTest.driver.findElement(returnAndOrders).isDisplayed()){
            flag = true;
        }else
        {
            flag = false;
        }
        return flag;
    }

}
