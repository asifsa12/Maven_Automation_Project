package Day10_121123;

import actionitems.Reusable_Methods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class T4_Google_Reusablemethod {
    public static void main(String[] args) {
        //setup chrome driver with webdrive manager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //open in incognito mode
        options.addArguments("incognito");
        //add some options for chrome options
        options.addArguments("start maximized");
        //define the webdriver and pass the options variable inside the chromedriver
        WebDriver asifDriver = new ChromeDriver(options);
        //navigate to google site
        asifDriver.navigate().to("https://google.com");

        //click on Google search button
        Reusable_Methods.clickMethod(asifDriver, "//*[@name='btnK']","Search Button");
        Reusable_Methods.clickMethod(asifDriver, "//*[@name='btnK']","Search Button");
        Reusable_Methods.clickMethod(asifDriver, "//*[@name='btnK']","Search Button");


        //submit
        try{
            asifDriver.findElement(By.xpath("//*[@name='btnK']")).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit on search button because" + e);
        }//end of submit exception



    }//end of main
}//end of class
