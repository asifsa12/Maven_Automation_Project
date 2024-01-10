package Practicecodes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Mike_AI5 {
    public static void main(String[] args) throws InterruptedException{
        ArrayList<String> firstName = new ArrayList<>();
        firstName.add("Derek");
        firstName.add("Joshua");

        ArrayList<String> lastName = new ArrayList<>();
        lastName.add("Stevens");
        lastName.add("Santos");

        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11104");
        zipCode.add("10065");

        ArrayList<String> doB = new ArrayList<>();
        doB.add("08/25/1998");
        doB.add("07/13/1985");

        ArrayList<String> vehicleYear = new ArrayList<>();
        vehicleYear.add("2015");
        vehicleYear.add("2020");

        ArrayList<String> vehicleMake = new ArrayList<>();
        vehicleMake.add("BMW");
        vehicleMake.add("Honda");

        ArrayList<String> vehicleModel = new ArrayList<>();
        vehicleModel.add("M4");
        vehicleModel.add("Accord");

        ArrayList<String> daysperWeek = new ArrayList<>();
        daysperWeek.add("4");
        daysperWeek.add("5");

        ArrayList<String> miles = new ArrayList<>();
        miles.add("2000");
        miles.add("45000");

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("Incognito");
        WebDriver driver = new ChromeDriver(options);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        driver.navigate().to("https://www.geico.com/");

        try {
            driver.findElement(By.xpath("//*[@class='product-checkbox']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on checkbox because" + e);
        }//end of product checkbox try catch

        try {
            driver.findElements(By.xpath("//*[text()= 'Start My Quote']")).get(1).click();
        } catch (Exception e) {
            System.out.println("Unable to click on start my quote because " + e);
        }//end of start my quote try catch

        try {
            WebElement zipfield = driver.findElement(By.xpath("//*[@id='bundle-modal-zip']"));
            zipfield.clear();
            zipfield.sendKeys(zipCode.get(0));
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Unable to input zipcode because of" + e);
        }//end of zipcode try catch

        try {
            driver.findElements(By.xpath("//*[@data-product= 'homeowners']")).get(1).click();

        } catch (Exception e) {
            System.out.println("Unable to click on homeowners because " + e);
            Thread.sleep(2000);
        }//end of homeowners try catch

        try {
            driver.findElements(By.xpath("//*[@value= 'Continue']")).get(0).click();
        } catch (Exception e) {
            System.out.println("Unable to click on continue because " + e);
            Thread.sleep(2000);
        }//end of continue try catch

        try {
            Thread.sleep(8000);
            driver.findElement(By.xpath("//*[@class= 'date']")).sendKeys(doB.get(0));
        } catch (Exception e) {
            System.out.println("Not able to input date of birth because of" + e);
            Thread.sleep(8000);
        }//end of date of birth try catch

        try {
            driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on next button because " + e);
            Thread.sleep(2000);
        }//end of click try catch

        try {
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@aria-label= 'First Name']")).sendKeys(firstName.get(0));
        } catch (Exception e) {
            System.out.println("Unable to type in first name for reason" + e);
        }//end of first name try catch

        try {
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@aria-label= 'Last Name']")).sendKeys(lastName.get(0));
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Unable to type in last name for reason " + e);
        }//end of last name try catch

        try {

            driver.findElement(By.xpath("//*[@class='btn btn--primary btn--full-mobile btn--pull-right']")).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Unable to click on button for reason" + e);
        } try {
            Thread.sleep(6000);
            ArrayList<WebElement> yesButton = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@id,'labelFor')]")));
            yesButton.get(0).click();
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Unable to click on yes button because" + e);
        }//end of click try catch

        try {
            ArrayList<WebElement> nextButton = new ArrayList<>(driver.findElements(By.xpath("//*[contains(text(), 'primary btn--full']")));
            nextButton.get(0).click();
        } catch (Exception e) {
            System.out.println("Unable to click on next button because of" + e);
        }//end of click try catch

        try{
            driver.findElement(By.xpath("//*[@for='Id_YesNoIsPurchasingHome_909491']")).click();
        }catch(Exception e){
            System.out.println("Unable to click on no button reason being" + e);
        }//end of click on no button try catch

        try{
            driver.findElement(By.xpath("//*[@id='Id_Next_64238']")).click();
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Unable to click on next button because of " + e);
        }//end of click nexxt button try catch

        try{
            driver.findElement(By.xpath("//*[text()='Next']")).click();
        }catch(Exception e){
            System.out.println("Not being able to click on next button because of" + e);
        }//end of click next try catch/end of click try catch

        try {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[contains(@class,'include-clear-action')]")).sendKeys("4125 44th Street");
        } catch (Exception e) {
            System.out.println("Not able to input address because " + e);
        }//end of address try catch

        try {
            driver.findElement(By.xpath("//*[@data-formotivid='UnitNumber']")).sendKeys("APT 3E");
        } catch (Exception e) {
            System.out.println("Unable to input apartment number because of " + e);
        }//end of apartment number try catch

        try {
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[contains(@class, 'btn--full-mobile btn--pull-right')]")).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Unable to click on next button due to " + e);
        }//end of click try catch
        driver.quit();
    }//end of main
}//end of class
