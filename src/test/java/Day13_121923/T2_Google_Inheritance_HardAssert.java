package Day13_121923;

import actionitems.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_Google_Inheritance_HardAssert {
    WebDriver driver;
    @BeforeSuite
    public void setUpChromeDriver() {
        driver = Reusable_Methods.setUpDriver();
    }//end of before suite

    @Test(priority = 1)
    public void tc001_verifyGoogleTitle() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //store the title of google page
        String actualTitle = driver.getTitle();
        //store the expected title
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle);
    }//end of test case 1

    @Test(priority = 2)
    public void tc002_searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        Reusable_Methods.sendKeys(driver, "//*[@name= 'q']", "BMW", "SearchField");
        //hit submit on the google search button
        Reusable_Methods.submitMethod(driver, "//*[@name= 'btnK']", "Submit");
        Thread.sleep(1000);
    }//end of test case 2

    @Test(priority = 3)
    public void tc003_captureSearchResult() {
        //store the search result into a string variable
        String result = Reusable_Methods.captureText(driver, "//*[@id = 'result-stats']", "SearchResult");
        //split the result
        String[] searchResultArray = result.split(" ");
        //print out the number only
        System.out.println("Search Result Number is " + searchResultArray[1]);
        String actualSearchNumber = searchResultArray[1];
        String expectedSearchNumber = "1,450,000,000";
        Assert.assertEquals(actualSearchNumber, expectedSearchNumber);
    }//end of test case 3


    @AfterSuite
    public void quitDriver(){
        driver.quit();
    }//end of after suite
}//end of class
