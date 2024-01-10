package Day7_112823;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T3Scroll {
    public static void main(String[] args) throws InterruptedException  {
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
        driver.navigate().to ("https://mlcalc.com/");
        //declare javascript executor
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        //scroll down 1000 pixels
        jse.executeScript("scroll(0,1000)");
        //wait 5 seconds
        Thread.sleep(5000);
        //scroll up 400 pixels
        //jse.executeScript("scroll(0,-200)");
        //wait 5 seconds
        //Thread.sleep(5000);
        //store the calculate button in a webelement variable
        WebElement calcButton = driver.findElement(By.xpath("//*[@value = 'Calculate']"));
        //scroll into element
        jse.executeScript("arguments[0].scrollIntoView(true);",calcButton);
//wait 2 seconds
        Thread.sleep(2000);
//quit browser
        driver.quit();
    }//end of main
}//end of class
