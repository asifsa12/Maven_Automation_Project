package actionitems;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Actionitem_03_two {
    public static void main(String[] args) throws InterruptedException {
        //setup the chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //define the webdriver
        WebDriver driver = new ChromeDriver();
        //navigate to Bing web page
        //Create an arraylist  of the five items you'll be searching for in Bing
        ArrayList<String> searchTerms = new ArrayList<>();
        searchTerms.add("ford fiesta");
        searchTerms.add("porsche 911");
        searchTerms.add("toyota avalon");
        searchTerms.add("hyundai elantra");
        searchTerms.add("tesla model x");
        // Perform a loop to search for each term
        for (int i = 0; i < searchTerms.size(); i++) {
            //navigate to google web page
            driver.navigate().to("https://www.google.com");
            //search for cars (using relative xpath)
            driver.findElement(By.xpath("//*[@name= 'q']")).sendKeys(searchTerms.get(i));
            //search for cars (using absolute xpath)
            //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("cars");
            //hit submit on google search button
            driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();
            //slow down by 2 seconds
            Thread.sleep(2000);
            //store the results in a string variable
            String searchResult = driver.findElement(By.xpath("//*[@id = 'result-stats']")).getText();
            //print out the result to the console
            System.out.println("Search result is " + searchResult);
            //split the search result using split command
            String[] searchResultArray = searchResult.split(" ");
            //print out only the search result number
            System.out.println("Search Result Number for car " + searchTerms.get(i) + " is " + searchResultArray[1]);
        }//end of for loop
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
