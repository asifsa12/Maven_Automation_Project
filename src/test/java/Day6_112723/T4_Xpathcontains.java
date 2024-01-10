package Day6_112723;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T4_Xpathcontains {
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
        //navigate to yahoo
        driver.navigate().to ("https://yahoo.com/");
        //wait 3 seconds
        Thread.sleep(3000);
        //click on the news menu (using xpath contains)
        driver.findElement(By.xpath("//*[contains(@class,'_yb_yc')]")).click();
        //wait 3 seconds
        Thread.sleep(3000);
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
