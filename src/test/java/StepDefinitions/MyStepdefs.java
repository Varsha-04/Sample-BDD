package test.java.StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import main.java.pageObjects.HomeScreenMethods;
import main.java.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    public static WebDriver driver;
    HomeScreenMethods homeScreenMethods = new HomeScreenMethods();
        @Given("^User launch the amazon website$")
        public void user_launch_the_amazon_website(){
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(Constants.url);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Then("^User lands on amazon home screen$")
        public void user_lands_on_amazon_home_screen(){
            Boolean flag = homeScreenMethods. verifyHomeScreen();
            assert flag == true;
        }

}
