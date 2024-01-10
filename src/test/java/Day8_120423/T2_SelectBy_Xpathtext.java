package Day8_120423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T2_SelectBy_Xpathtext {
    public static void main(String[] args) throws InterruptedException{
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
        //wait few seconds to load
        Thread.sleep(3000);
        //clear and enter the homevalue
        WebElement homeVal = driver.findElement(By.xpath("//*[@id = 'homeval']"));
        homeVal.clear();
        homeVal.sendKeys("450000");
        //clear and enter the down payment
        WebElement dPayment = driver.findElement(By.xpath("//*[@id = 'downpayment']"));
        dPayment.clear();
        dPayment.sendKeys("9000");
        //click on dropdown
         driver.findElement(By.xpath("//*[@name = 'param[start_month]']")).click();
        //click by xpath visible text for january
        driver.findElement(By.xpath("//*[text() = 'Jan']")).click();
        //click to december
        driver.findElement(By.xpath("//*[text() = 'Dec']")).click();
        //wait few seconds to load
        Thread.sleep(6000);
        //select by visible text
        //quit driver
        driver.quit();

    } // end of main
}//end of class