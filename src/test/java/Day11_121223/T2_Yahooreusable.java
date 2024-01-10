package Day11_121223;

import actionitems.Reusable_Methods;
import org.openqa.selenium.WebDriver;

public class T2_Yahooreusable {
    public static void main(String[] args) {
    WebDriver driver = Reusable_Methods.setUpDriver();
    //navigate to yahoo main page
        driver.navigate().to("https://yahoo.com");
        //click on sports menu, third tab, index 2
        Reusable_Methods.clickByIndexMethod(driver, "//*[contains (@class,'_yb_q22uj')]", 2, "yahooHeaders");
    //quit driver
        driver.quit();
    }//end of main
}//end of class

















//public static void main(String[] args) {
        //instantiate the driver
       // WebDriver driver = Reusable_Methods.setUpDriver();
        //navigate to metlife
        //driver.navigate().to("https://www.yahoo.com/");
        //click on the sports menu (third tab, index 2)
        //Reusable_Methods.clickByIndexMethod(driver, "//*[contains(@class,'_yb_q22uj')]", 2, "yahoo headers");
        //quit driver
        //driver.quit();
    //end of main