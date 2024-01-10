package Day11_121223;

import actionitems.Reusable_Methods;
import org.openqa.selenium.WebDriver;

public class T1_Metlifereusable {
    public static void main(String[] args) throws InterruptedException {
        //instantiate the driver
        WebDriver driver = Reusable_Methods.setUpDriver();
        //navigate to metlife
        driver.navigate().to("https://www.metlife.com/");
        //click on the solutions tab
        Reusable_Methods.clickMethod(driver, "//*[@aria-controls = 'section1']", "Solutions Tab");
        //click on the dental menu
        Reusable_Methods.clickMethod(driver, "//*[text() = 'Dental']", "Solutions Tab");
        //quit the driver
        Thread.sleep(3000);
        driver.quit();
    }//end of main
}//end of class
