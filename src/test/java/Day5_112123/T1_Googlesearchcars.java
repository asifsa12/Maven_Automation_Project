package Day5_112123;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Googlesearchcars {
    public static void main(String[] args) throws InterruptedException {
                //setup the chromedriver with webdrivermanager
                WebDriverManager.chromedriver().setup();
                //define the webdriver
                WebDriver driver = new ChromeDriver();
                //navigate to google web page
                driver.navigate().to("https://google.com");
                //maximize the window
                driver.manage().window().maximize();
                //wait for 2 seconds
                 Thread.sleep(2000);
               //search for cars
                driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("cars");
               //hit submit on google search button
                driver.findElement(By.xpath("//*[@name= 'btnK']")).submit();
                 //wait for 2 seconds
                Thread.sleep(2000);
                //store the results in a string variable
                String searchResult = driver.findElement(By.xpath("//*[@id= 'result-stats']")).getText();
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
