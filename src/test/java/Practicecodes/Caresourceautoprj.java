package Practicecodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Caresourceautoprj {
    public static void main(String[] args) throws InterruptedException {
        //create arraylist for zipCode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("10010");
        zipCode.add("10013");
        ArrayList<String> address = new ArrayList<>();
        address.add("11 E 26th St, New York, NY 10010");
        address.add("251 Spring St, New York, NY 10013");
        for (int i = 0; i < zipCode.size(); i++) {

            WebDriverManager.chromedriver().setup();
            //set chromeoptions for preset of arguments for the driver
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            options.addArguments("start-maximized");
            //declare your web driver and pass the options variable inside the chromedriver
            WebDriver driver = new ChromeDriver(options);
            //Go to Caresource homepage
            driver.navigate().to("https://www.caresource.com/");
            //declare javascript executor
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //Click on Find a doctor
            driver.findElement(By.xpath("//*[@id='menu-item-123974']")).click();
            //sleep
            Thread.sleep(2000);
            //Click on Get Started
            driver.findElement(By.xpath("//*[@class='button']")).click();
            //sleep
            Thread.sleep(2000);
            //Enter address
            driver.findElement(By.xpath("//*[@type='text']")).sendKeys(address.get(i));
            //sleep
            Thread.sleep(2000);
        }//end of for loop
    }// end of main
}//end of class
