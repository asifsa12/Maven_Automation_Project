package Day10_121123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class T1_MouseActions {
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
        //navigate to USPS site
        driver.navigate().to("https://usps.com");
        Thread.sleep(3000);
        //declare the mouse Actions
        Actions mouseActions = new Actions(driver);
        //hover to Quick tools
        WebElement quickTool = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
        mouseActions.moveToElement(quickTool).perform();
        //click on Track a Package using mouse click
        WebElement trackPackage = driver.findElement(By.xpath("//*[text()='Track a Package']"));
        mouseActions.moveToElement(trackPackage).click().perform();
        //type in invalid tracking number on tracking search field
        Thread.sleep(3000);
        WebElement searchField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
        //when the element is under the text area, you may need to click on that text box first and then use sendkeys
        mouseActions.moveToElement(searchField).click().sendKeys("181818187229647478").perform();
        Thread.sleep(3000);
        driver.quit();
    }//end of main
}//end of class
