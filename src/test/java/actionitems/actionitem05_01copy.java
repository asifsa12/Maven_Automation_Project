package actionitems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class actionitem05_01copy {
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
        //arraylist for prior address
        ArrayList<String> priorAddress = new ArrayList<>();
        priorAddress.add("42 West 35 St, New York NY 10001");
        priorAddress.add("11 Howard St, New York, NY 10013");
        //arraylist for prior Apt number
        ArrayList<String> prioraptNumber = new ArrayList<>();
        prioraptNumber.add("806");
        prioraptNumber.add("1F");
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
        avgMiles.add("15000");
        avgMiles.add("6000");
        WebDriverManager.chromedriver().setup();
        //set chromeoptions for preset of arguments for the driver
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        options.addArguments("start-maximized");
        WebDriver driver=null;
        //declare your web driver and pass the options variable inside the chromedriver
        //start for loop, keep all instructions contained within the loop
        for (int i = 0; i < zipCode.size(); i++) {
            driver = new ChromeDriver(options);
            //go to Geico
            driver.navigate().to("https://www.geico.com/");
            //sleep
            Thread.sleep(2000);
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
            //Thread.sleep(2000);
            //click homeowners checkbox
            driver.findElements(By.xpath("//*[@data-product= 'homeowners']")).get(1).click();
            //sleep
            Thread.sleep(6000);
            //click continue
            try {
                driver.findElements(By.xpath("//*[@value= 'Continue']")).get(0).click();
                Thread.sleep(2000);
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
            Thread.sleep(6000);
            //click next
            try {
                driver.findElement(By.xpath("//*[contains(@class, 'btn btn--primary btn--full-mobile btn--pull-right')]")).click();
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Unable to click on auto check because" + e);
            }//end of click next catch try
            //enter first name

            //enter last name
            //click on next
            //enter a valid address
            //enter apartment #
            //click next
            //click no
            //click next
            //click yes
            //click next
            //enter prior address
            //enter apt # for prior address
            //enter zip code for prior address
            //click next
            //choose no
            //click next
            //select year of vehicle
            //select make
            //select model
            //click next
            //click next again
            //choose 'leased'
            //click next
            //choose commute
            //click next
            //choose days per week
            //enter miles
            //click next
            //click next again
            //click next again
            //choose gender
            //click agree and continue
        }//end of for loop
        driver.quit();
    }//end of main
}//end of class
