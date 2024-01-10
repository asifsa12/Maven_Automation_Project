package Day7_112823;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class T1WebElement {
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
        driver.navigate().to ("https://mortgagecalculator.org");
        //store the home value into webelement variable
        WebElement homeValue = driver.findElement (By.xpath("//*[@id = 'homeval']"));
        driver.findElement(By.id("homeval"));
        driver.findElement(By.className("gfjhg"));
                // clear the homevalue field
        homeValue.clear();
        //type in 900000
        homeValue.sendKeys("900000");
        //wait 2 seconds
        Thread.sleep(2000);
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
