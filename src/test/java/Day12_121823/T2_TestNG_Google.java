package Day12_121823;

import actionitems.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class T2_TestNG_Google {
    WebDriver driver;
    @BeforeSuite
    public void setUpChromeDriver() {
        driver = Reusable_Methods.setUpDriver();
    }//end of before suite
    // TestJ uses alphanumerical ordering for test cases
    //To work around this, we can use priority or depends on
    //below is an example of using depends on
    //priority is better than depends on because it keeps your test cases independent of one another
    @Test
    public void searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        Reusable_Methods.sendKeys(driver,"//*[@name= 'q']","BMW","SearchField");
        //hit submit on the google search button
        Reusable_Methods.submitMethod(driver,"//*[@name= 'btnK']","Submit");
        Thread.sleep(1000);
    }//end of test case 1

    @Test(dependsOnMethods = "searchForACar")
    public void captureSearchResult(){
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
