package actionitems;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
public class Actionitem_05_01 {
    public static void main(String[] args) throws InterruptedException {
        //create arraylist for zipcode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("10001");
        zipCode.add("10013");
        //arraylist for dob
        ArrayList<String> dateofBirth = new ArrayList<>();
        dateofBirth.add("01121997");
        dateofBirth.add("12151969");
        //arraylist for first name
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Steve");
        firstName.add("Aladdin");
        //arraylist for last name
        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Lebron");
        lastName.add("Jones");
        //arraylist for address
        ArrayList<String> address = new ArrayList<>();
        address.add("42 West 35 St, New York NY 10001");
        address.add("11 Howard St, New York, NY 10013");
        //arraylist for Apt number
        ArrayList<String> aptNumber = new ArrayList<>();
        aptNumber.add("806");
        aptNumber.add("1F");
        //arraylist for vehicle year
        ArrayList<String> vehicleYear = new ArrayList<>();
        vehicleYear.add("2006");
        vehicleYear.add("2018");
        //arraylist for vehicle make
        ArrayList<String> vehicleMake = new ArrayList<>();
        vehicleMake.add("Toyota");
        vehicleMake.add("BMW");
        //arraylist for vehicle model
        ArrayList<String> vehicleModel = new ArrayList<>();
        vehicleModel.add("Avalon");
        vehicleModel.add("M4");
        //arraylist for days per week
        ArrayList<String> dpW = new ArrayList<>();
        dpW.add("6");
        dpW.add("3");
        //arraylist for miles
        ArrayList<String> avgMiles = new ArrayList<>();
        avgMiles.add("15");
        avgMiles.add("60");
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver=null;
        driver = new ChromeDriver(options);
        //declare your web driver and pass the options variable inside the chromedriver
        //start for loop, keep all instructions contained within the loop
        for (int i = 0; i < zipCode.size(); i++) {
            //go to Geico
            driver.navigate().to("https://www.geico.com/");
            //sleep
            Thread.sleep(6000);
            //click on auto checkbox
            try {
                driver.findElement(By.xpath("//*[contains(@class, 'icon-container')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on auto check because" + e);
            }//end of try and catch auto checkbox
            //sleep
            Thread.sleep(2000);
            //click on 'start my quote'
            try {
            driver.findElement(By.xpath("//*[contains(@class, 'modal-trigger btn btn--primary btn--full-mobile')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click on 'start my quote' because" + e);
            }//end of start my quote catch try
            //enter zip codes
            driver.findElement(By.xpath("//*[@id = 'bundle-modal-zip']")).sendKeys(zipCode.get(i));
            //sleep
            Thread.sleep(2000);
            //click homeowners checkbox
            driver.findElements(By.xpath("//*[@data-product= 'homeowners']")).get(1).click();
            //sleep
            Thread.sleep(2000);
            //click continue
            try {
                driver.findElements(By.xpath("//*[@value= 'Continue']")).get(0).click();
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to click continue because" + e);
            }//end of click continue catch try
            //enter date of birth
            try {
                driver.findElement(By.xpath("//*[@aria-label='Date of Birth']")).sendKeys(dateofBirth.get(i));
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Unable to enter d.o.b because" + e);
            }//end of date of birth catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[@class= 'btn btn--primary btn--full-mobile btn--pull-right']")).click();
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to click on auto check because" + e);
            }//end of click next catch try
            //enter first name aria-label="First Name"
            try {
                driver.findElement(By.xpath("//*[@aria-label ='FirstName']")).sendKeys(firstName.get(i));
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to enter first name because" + e);
            }//end of first name catch try
            //enter last name
            try {
                driver.findElement(By.xpath("//*[@aria-label ='LastName']")).sendKeys(lastName.get(i));
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to enter last name because" + e);
            }//end of last name catch try
            //sleep
            Thread.sleep(2000);
            //click on next
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'Id_Next')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next catch try
            //enter a valid address
            try {
                driver.findElement(By.xpath("//*[contains(@class,'address-search-field include-clear-action']")).sendKeys(address.get(i));
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to enter address because" + e);
            }//end of address catch try
            //enter apartment #
            try {
                driver.findElement(By.xpath("//*[contains(@id,'Id_GiveUnitNumber_']")).sendKeys(aptNumber.get(i));
                Thread.sleep(6000);
            } catch (Exception e) {
                System.out.println("Unable to enter apt number because" + e);
            }//end of apartment # catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'Id_Next')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next catch try
            //click yes (address of home to insure?)
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'labelForYes')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click yes because" + e);
            } //end of click yes catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next
            //click no (process of purchasing your home?)
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'labelForNo')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click no because" + e);
            } //end of click no catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next catch try
            //click no (haven't lived for less than 2 years)
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'labelForNo')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click no because" + e);
            } //end of click no catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next catch try
            //click no, no VIN
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'labelForNo')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click no because" + e);
            } //end of click no catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'Id_Next_')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next catch try

            //select year of vehicle
            WebElement dropdown = driver.findElement(By.id("dropdown Id"));
            Select dropdownSelect = new Select(dropdown);
            //select year
            driver.findElement(By.xpath("//*[contains(@id = 'Id_GiveYear_')]")).sendKeys(vehicleYear.get(i));

            //select make
            driver.findElement(By.xpath("//*[contains(@id = 'Id_GiveMake_')]")).sendKeys(vehicleMake.get(i));

            //select model
            driver.findElement(By.xpath("//*[contains(@id = 'Id_GiveModel_')]")).sendKeys(vehicleModel.get(i));
            //sleep
            Thread.sleep(2000);
            //click on next (anti-theft device)
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'Id_Next')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next because" + e);
            } //end of click next catch try

            //choose 'leased'
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'labelForL')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click leased because" + e);
            } //end of click leased catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@class, 'btn btn--primary btn--full-mobile btn--pull-right')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next again because" + e);
            } //end of click next again catch try

            //choose commute
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'labelForC')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click commute because" + e);
            } //end of click commute catch try
            //sleep
            Thread.sleep(2000);
            //choose days per week
            try {
                driver.findElement(By.xpath("//*[contains(@id = 'Id_GiveDaysPerWeekCommute_')]")).sendKeys(dpW.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter dpw because" + e);
            } // end of dpw catch try
            //sleep
            Thread.sleep(2000);
            //enter miles
            try {
                driver.findElement(By.xpath("//*[contains(@id = 'Id_GiveMilesOneWay_')]")).sendKeys(avgMiles.get(i));
            } catch (Exception e) {
                System.out.println("Unable to enter avg miles because" + e);
            } // end of avg miles catch try
            //sleep
            Thread.sleep(2000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next again because" + e);
            } //end of click next catch try
            //sleep
            Thread.sleep(2000);
            // click next again
            try {
                driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next again because" + e);
            } //end of click next catch try
            //sleep
            Thread.sleep(2000);
            // click next again
            try {
                driver.findElement(By.xpath("//*[contains(@type, 'submit')]")).click();
            } catch (Exception e) {
                System.out.println("Unable to click next again because" + e);
            } //end of click next catch try
            //sleep
            Thread.sleep(2000);
            //choose gender
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'Id_GiveGender_')]")).sendKeys("Male");
            } catch (Exception e) {
                System.out.println("Unable to click gender  because" + e);
            } //end of gender catch try
            //sleep
            Thread.sleep(2000);
            //click agree and continue
            try {
                driver.findElement(By.xpath("//*[contains(@id, 'Id_ComboActivity_')]")).sendKeys("Male");
            } catch (Exception e) {
                System.out.println("Unable to click gender  because" + e);
            } //end of click agree and continue catch try
            //sleep
            Thread.sleep(2000);
            //go back to main
        }//end of for loop
        driver.quit();
    }//end of main
}//end of class