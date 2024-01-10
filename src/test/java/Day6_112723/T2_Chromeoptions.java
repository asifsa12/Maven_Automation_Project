package Day6_112723;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T2_Chromeoptions {
    public static void main(String[] args) throws InterruptedException {
        //setup chrome driver with webdrive manager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chrome options
        options.addArguments("start maximized");
        //open in incognito mode
        options.addArguments("start maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //navigate to yahoo
        driver.navigate().to ("https://yahoo.com/");
        //wait 3 seconds
        Thread.sleep(3000);
        //quit the browser
    }//end of main
}//end of class
