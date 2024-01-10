package actionitems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;
public class Actionitem_04 {
    public static void main(String[] args) throws InterruptedException {
        //setup chrome driver with webdrive manager
        WebDriverManager.chromedriver().setup();
        //declare the chrome options
        ChromeOptions options = new ChromeOptions();
        //add some options for chrome options
        options.addArguments("start maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //define the webdriver and pass the options argument
        WebDriver driver = new ChromeDriver(options);
        //declare an arraylist of zip codes
        ArrayList<String> zipCodes = new ArrayList<>();
        zipCodes.add("11232");
        zipCodes.add("10001");
        zipCodes.add("11234");
        //begin for loop
        for (int i = 0; i < zipCodes.size(); i++) {
            //navigate to weight watchers web page
            driver.navigate().to("https://www.weightwatchers.com/us/find-a-workshop/");
            //click on Find a Workshop
            driver.findElement(By.xpath("//*[text()='Find a Workshop']")).click();
            //click on In Person
            driver.findElement(By.xpath("//*[text()='In-Person']")).click();
            //slow down by 2 seconds
            Thread.sleep(2000);
            //search for zipcodes (using relative xpath)
            WebElement Search = driver.findElement (By.xpath("//*[@id = 'location-search']"));
            //clear text box
            Search.clear();
            //insert zip code
            Search.sendKeys("11232");
            //submit
            Search.submit();
            //create arraylist for webelement
            ArrayList < WebElement > studio = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class,'linkUnderline-1_h4g')]")));
            //if i =0 , click on second link
            if (i == 0) {
                studio.get(1).click();
            } else if (i == 1) {
                studio.get(2).click();
            } else if (i==2) {
                studio.get(0).click();
            } //end of if statement
            //slow down by 2 seconds
            Thread.sleep(2000);
            String address = driver.findElement(By.xpath("//*[@class = 'address-2PZwW']")).getText();
            //print address
            System.out.println("The address is "  + address);
            //install javascript driver
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            //scroll to table
            jse.executeScript("scroll(0,-200)");
            //capture table
            WebElement Table = driver.findElement (By.xpath("//*[@id = 'studioWorkshopSchedule']"));
            //print
            System.out.println(" " + Table.getText());
        }//end of for loop
        //quit the browser
        driver.quit();
    }//end of main
}//end of class
