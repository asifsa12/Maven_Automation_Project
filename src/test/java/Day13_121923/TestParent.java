package Day13_121923;

import actionitems.Reusable_Methods;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;


public class TestParent {
    //declare a global public driver variable
    public static WebDriver driver;
    //declare reports variable
    public static ExtentReports reports;
    //extent logger
    public static ExtentTest logger;


    @BeforeSuite
    public void setupReports () {
        //declare report path
        reports = new ExtentReports("src/main/java/HTML_Report/AutomationReport.html", true);
    }

    @BeforeClass
    public void setUpChromeDriver() {
        driver = Reusable_Methods.setUpDriver();
    }//end of before suite

    @BeforeMethod
    public void setTestName (Method methodName) {
        logger = reports.startTest(methodName.getName());
    }//end of before method

    @AfterMethod
    public void endTest () {
        reports.endTest(logger);
    }//end of after method

    @AfterClass
    public void quitDriver () {
        driver.quit();
    }


    @AfterSuite
    public void flushReport (){
        //generate final report
        reports.flush();
    }//end of after suite
}//end of class
