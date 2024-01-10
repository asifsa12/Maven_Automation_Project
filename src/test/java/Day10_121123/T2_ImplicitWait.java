package Day10_121123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class T2_ImplicitWait {
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
        //declare your implicit wait statement here
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        //navigate to google site
        driver.navigate().to("https://google.com");
        //search for a car
        try {
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");
        } catch (Exception e) {
            System.out.println("Unable to enter search value on field because" + e);
        }//end of search exception

        //submit
        try{
            driver.findElement(By.xpath("//*[@name='btnK']")).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on search button because" + e);
        }//end of submit exception

        //capture the result and print i t
        try {
            String result = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
            System.out.println("Result is " + result);
        } catch (Exception e) {
            System.out.println("Unable to capture search result: " + e);
        } //end of search result exception


    }//end of main
}//end of class
