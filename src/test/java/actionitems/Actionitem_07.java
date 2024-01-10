package actionitems;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Actionitem_07 {
//navigate to fideliscare, execute test case 1
WebDriver driver;
    @BeforeSuite
    public void setUpChromeDriver() {
        driver = Reusable_Methods.setUpDriver();
    }//end of before suite

    @Test
    public void tc001_getCoverage() {
        //navigate to fidelis care website
        driver.navigate().to("https://www.fideliscare.org/");
        //click search engine
        Reusable_Methods.clickByIndexMethod(driver,"//*[@aria-haspopup='true']",1,"SearchButton");
        //enter 'get dental coverage'
        Reusable_Methods.sendKeys(driver, "//*[@class= 'form-control search-input']", "SearchField", "get dental coverage");
        //click on search icon
        Reusable_Methods.clickByIndexMethod(driver,"//*[@aria-label='Execute Search']",0,"searchButton");
        //capture the search results
        String Results = Reusable_Methods.captureText(driver,"//*[@class= 'gsc-result-info']", "results");
        //split and print the search number
        String[] searchResultArray = Results.split(" ");
        System.out.println("Search Result Number is " + searchResultArray[1]);
        //click on get dental care link
        Reusable_Methods.clickMethod(driver, "//*[text()='Get Dental Coverage']","Dental link");
    }//end of test case 1


    @Test (dependsOnMethods = "tc001_getCoverage")
    //depends on test case 1
    public void tc002_newTab() {
        //open a new tab
        Reusable_Methods.switchtabByIndex(driver,1 );
        //enter first name
        Reusable_Methods.sendKeys(driver, "//*[@formcontrolname= 'firstName']", "firstName", "John");
        //enter last name
        Reusable_Methods.sendKeys(driver, "//*[@id= 'lastName']", "lastName", "Wick");
        //enter zip code
        Reusable_Methods.sendKeys(driver, "//*[@id= 'zipCode']", "zip", "10001");
        //select county
        Reusable_Methods.selectByVisibleText(driver,"//*[@id= 'county']","New York","county");
        //enter phone number
        Reusable_Methods.sendKeys(driver, "//*[@id= 'phoneNumber']", "phone", "9176343779");
        //enter a fake email
        Reusable_Methods.sendKeys(driver, "//*[@id= 'email']", "email", "johnlovesfood@gmail.com");
        //check the 'contact me' button
        Reusable_Methods.clickMethod(driver,"//*[@for='contactMe']","contact me");
        //click on text contact me
        Reusable_Methods.clickMethod(driver,"//*[@type='submit']","contact me text");
        //capture entire 'Thank you' message
        String Results = Reusable_Methods.captureText(driver,"//*[@class= 'alert alert-success']", "results");
        //print out the message
        System.out.println("The message is " + Results);
        //close current tab
        driver.close();
    }//end of test case 2



    @Test (dependsOnMethods = "tc002_newTab")
    //depends on test case 1
    public void tc003_memberPortal() throws InterruptedException {
        //switch back to default tab
        Reusable_Methods.switchtabByIndex(driver,0 );
        Thread.sleep(3000);
        //click on login
        Reusable_Methods.clickByIndexMethod(driver,"//*[@aria-haspopup='true']",0,"login");
        //click on
        Reusable_Methods.clickMethod(driver, "//*[@target= '_blank']","memberonlineportal");
        //new tab opens to switch tab
        Reusable_Methods.switchtabByIndex(driver,1 );
        Thread.sleep(3000);
        //capture and print out entire message under helpful hints
        String Results = Reusable_Methods.captureText(driver,"//*[@id= 'dnn_ctr5328_HtmlModule_lblContent']", "hints");
        System.out.println("The hints are: " + Results);
        //close the current tab
        driver.close();
    }//end of test case 3



}//end of class
