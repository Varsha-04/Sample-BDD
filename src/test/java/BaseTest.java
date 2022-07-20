package test.java;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import main.java.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
//    public ExtentHtmlReporter extentHtmlReporter;
//    public static ExtentReports extentReports;
//    public static ExtentTest logger;


    @BeforeTest
    public void beforeTestMethod() {
        System.out.println("Execution starts");
    }


    @BeforeMethod
    @Parameters(value = {"browserName"})
    public void beforeMethod(String browserName) {
        setupDriver(browserName);
        driver.manage().window().maximize();
        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }


    @AfterTest
    public void afterTestMethod() {
        System.out.println("Execution stops");
    }


    public void setupDriver(String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver");
            driver = new ChromeDriver();
//        } else {
//            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "driver/chromedriver");
//            driver = new ChromeDriver();
//        }
        }

    }
}
