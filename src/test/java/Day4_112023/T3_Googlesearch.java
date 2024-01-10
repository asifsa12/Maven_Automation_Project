package Day4_112023;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_Googlesearch {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to google web page
        driver.navigate().to("https://google.com");
        //maximize the window
        driver.manage().window().maximize();
        //wait for 3 seconds
        Thread.sleep(5000);
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
