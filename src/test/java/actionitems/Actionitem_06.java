package actionitems;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class Actionitem_06 {
    public static void main(String[] args) throws InterruptedException {
    //setup driver
    WebDriver driver = Reusable_Methods.setUpDriver();
    //create an array list for zipcodes
    ArrayList <String> zipCodes = new ArrayList<>();
    zipCodes.add("10001");
    zipCodes.add("11234");
    zipCodes.add("10463");
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    for (int i=0; i <zipCodes.size(); i++) {
        //navigate to weight watchers website
        driver.navigate().to("https://weightwatchers.com/us/");
        //click on find a workshop MenuItem_menuItemIconWrapper__ZwyL0
        Reusable_Methods.clickMethod(driver, "//*[text()='Find a Workshop']", "Find a Workshop");
        //click on search for a location
        Reusable_Methods.clickMethod(driver,"//*[@id='location-search']","Search For Location");
        //enter the zipcodes
        Reusable_Methods.sendKeys(driver,"//*[@id='location-search']","Search For Location",zipCodes.get(i));
        //submit the zipcodes
        Reusable_Methods.submitMethod(driver,"//*[@id='location-search']", "Search For Location");
        //click on the studio links
        ArrayList<WebElement> watchStudio =new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class, '3SE46')]")));
        //start the if statement
        if (i==0) {//if i==0 click on the second link
            Reusable_Methods.clickByIndexMethod(driver, "//*[contains(@class, '3SE46')]", 1, "Studio Links");
        }//end of if statement
        if (i==1) {//if i==1 click on the third studio link
            Reusable_Methods.clickByIndexMethod(driver, "//*[contains(@class, '3SE46')]", 2, "Studio Links");
        }//end of if statement
        if (i==2) {//if i==2 click on first link
            Reusable_Methods.clickByIndexMethod(driver, "//*[contains(@class, '3SE46')]", 0, "Studio Links");
        }//end of if statement

        //declare web element to store studio details in
        WebElement workSchedule = driver.findElement(By.xpath("//*[@id= 'studioWorkshopSchedule']"));
        //Reusable_Methods.scrollMethod(driver,"//*[@id= 'workSchedule']"));
        jse.executeScript("arguments[0].scrollIntoView(true);",workSchedule);
        WebElement workAddress = driver.findElement(By.xpath("//*[@class= 'address-2PZwW']"));
        System.out.println("Studio Details are " + zipCodes.get(i) + "  " + workSchedule.getText() + " " + workAddress.getText());

    }//end of for loop
        driver.quit();
    }//end of main
}//end of class
