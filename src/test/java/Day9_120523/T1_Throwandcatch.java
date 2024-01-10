package Day9_120523;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T1_Throwandcatch  {
    public static void main(String[] args) throws InterruptedException {
        //setup chrome driver with webdrive manager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chrome options
        options.addArguments("start maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //run in headless mode (runs in the background)
        //options.addArguments("headless");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to mortgage calculator site
        driver.navigate().to("https://mortgagecalculator.org");

        try {
            //enter a home value
            WebElement homeValue = driver.findElement(By.xpath("//*[@id = 'homeval']"));
            //clear the field
            homeValue.clear();
            //enter a value of 950000
            homeValue.sendKeys("950000");
        } catch (Exception e) {
            System.out.println("Unable to enter home value for reason " + e);
        }//end of home value try catch

        try {
            //enter a down payment value
            WebElement dpValue = driver.findElement(By.xpath("//*[@id = 'downpayment']"));
            //clear the field
            dpValue.clear();
            //enter a value of 950000
            dpValue.sendKeys("200000");
        } catch (Exception e){
            System.out.println("Unable to enter downpayment value for reason " + e);
            // quit driver
            driver.quit();
        }//end of down payment try catch
    }//end of main
}//end of class
