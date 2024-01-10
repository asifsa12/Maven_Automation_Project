package Day15_010824;

import Day13_121923.TestParent;
import Day14_010224.ReusableMethods_Loggers;
import org.testng.annotations.Test;

public class T1_google_screenshot extends TestParent {
    @Test
    public void tc001_searchForACar() throws InterruptedException {
        //navigate to google web page
        driver.navigate().to("https://www.google.com");
        //search for BMW
        ReusableMethods_Loggers.sendKeys(driver, "//*[@name= 'q']", "Searchfield","BMW",logger);
        //hit submit on the google search button
        ReusableMethods_Loggers.submitMethod(driver, "//*[@name= 'btnKlp']","Submit", logger);
        Thread.sleep(1000);
    }//end of test case 1

    public void tc002git_Commit () {
        //committing a new test case
    }// end of tc 02
}
