package Day13_121923;

import actionitems.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T1_Google_Inheritance extends TestParent {
    WebDriver driver;
    @BeforeSuite
    public void setUpChromeDriver() {
        driver = Reusable_Methods.setUpDriver();
    }//end of before suite

    @Test
    public void tc001searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        Reusable_Methods.sendKeys(driver,"//*[@name= 'q']","BMW","SearchField");
        //hit submit on the google search button
        Reusable_Methods.submitMethod(driver,"//*[@name= 'btnK']","Submit");
        Thread.sleep(1000);
    }//end of test case 1

    @Test (dependsOnMethods = "searchForACar")
    public void tc002captureSearchResult(){
        //store the search result into a string variable
        String result = Reusable_Methods.captureText(driver,"//*[@id = 'result-stats']","SearchResult");
        //split the result
        String[] searchResultArray = result.split(" ");
        //print out the number only
        System.out.println("Search Result Number is " + searchResultArray[1]);
    }//end of test case 2

    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }//end of after suite
}//end of class


