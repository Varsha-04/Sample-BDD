package test.java;

import main.java.pageObjects.HomeScreenMethods;
import main.java.pageObjects.LoginScreenMethods;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{
        HomeScreenMethods homeScreenMethods = new HomeScreenMethods();
        LoginScreenMethods loginScreenMethods = new LoginScreenMethods();

    @Test(priority = 1)
    public void testHomeScreenOpen(){
       Boolean flag = homeScreenMethods. verifyHomeScreen();
       assert flag == true;
    }

    @Test(priority = 2)
    public void testSuccessfulLogin(){
        homeScreenMethods.clickLoginIconOnHome();
        Boolean flag = loginScreenMethods.voidEnterLoginCredentials("abc123@gmail.com","23456");
        assert flag == true;
    }




}
