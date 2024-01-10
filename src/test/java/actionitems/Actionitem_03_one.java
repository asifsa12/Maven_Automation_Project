package actionitems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionitem_03_one {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to Bing web page
        driver.navigate().to("https://bing.com");
        //wait for 2 seconds
        Thread.sleep(2000);
        //maximize window
        driver.manage().window().maximize();
        //search for porsche 911
        driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("porsche 911");
        //click on search button icon
        driver.findElement(By.xpath("//*[@id='search_icon']")).submit();
        //store the results in a string variable
        String searchResult = driver.findElement(By.xpath("//*[@class= 'sb_count']")).getText();
        //print out the result to the console
        System.out.println("Search result is " + searchResult);
        //split the search result using the split command
        String[] searchResultArray = searchResult.split(" ");
        //print out only the search results number
        System.out.println("Search result is " + searchResultArray[1]);
        //quit the browser
        driver.quit();

    }//end of main
}//end of class
