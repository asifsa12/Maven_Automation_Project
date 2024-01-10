package Day8_120423;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class T1Select_Statement {
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

        //select January from the month dropdown
        WebElement startMonth = driver.findElement(By.xpath("//*[@name = 'param[start_month]']"));
        //set the select function for the start month dropdown
        Select startMonthDropdown = new Select(startMonth);
        //wait few seconds to load
        Thread.sleep(2000);
        //select by visible text
        startMonthDropdown.selectByVisibleText("Jan");
        //quit driver
        driver.quit();

    } // end of main
}//end of class
