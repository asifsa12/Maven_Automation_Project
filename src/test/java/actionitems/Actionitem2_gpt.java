package actionitems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
    public class Actionitem2_gpt {

        public static void main(String[] args) {
            // Setup the ChromeDriver with WebDriverManager
            WebDriverManager.chromedriver().setup();

            // Define the WebDriver
            WebDriver driver = new ChromeDriver();

            // Navigate to Bing web page
            driver.navigate().to("https://bing.com");

            // Create an ArrayList of the five items you'll be searching for in Bing
            ArrayList<String> searchTerms = new ArrayList<>();
            searchTerms.add("ford fiesta");
            searchTerms.add("porsche 911");
            searchTerms.add("toyota avalon");
            searchTerms.add("hyundai elantra");
            searchTerms.add("tesla model x");

            // Perform a loop to search for each term
            for (String term : searchTerms) {
                // Find the search bar by its name attribute
                WebElement searchBox = driver.findElement(By.name("q"));

                // Clear the search box
                searchBox.clear();

                // Type the search term directly into the search bar
                searchBox.sendKeys(term);

                // Press Enter (using Keys.ENTER)
                searchBox.sendKeys(Keys.ENTER);

                // Use explicit wait for the search results to become visible
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class= 'sb_count']")));

                // Print the search result for the current term
                String searchResult = driver.findElement(By.xpath("//*[@class= 'sb_count']")).getText();
                System.out.println("Search result for " + term + " is " + searchResult);
            }

            // Close the browser
            driver.quit();
        }//end of class
    }//end of main

