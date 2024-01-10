package actionitems;

import Day13_121923.TestParent;
import Day14_010224.ReusableMethods_Loggers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


//Project name: Caresource
    public class Actionitem_08 extends TestParent {
        @Test (priority = 1)
        public void tc001_verifyIfRememberMeIsUnChecked() throws InterruptedException {
            //navigate to Caresource landing page
            driver.navigate().to("https://www.caresource.com/");
            //hover over Login dropdown
            ReusableMethods_Loggers.hoverMethod(driver,logger,driver.findElement(By.id("menu-item-82594")) );
            //click on Member button
            ReusableMethods_Loggers.clickMethod(driver, "//*[text() = 'Member']", "Member Button",  logger);
            //sleep
            Thread.sleep(3000);
            //go to second tab
            ReusableMethods_Loggers.switchtabByIndex(driver,1,logger);
            //store unchecked option into a boolean variable
            boolean isRememberMeChecked = driver.findElement(By.xpath("//*[@class = 'custom-checkbox']")).isSelected();
            //print out if checkbox "Remember Me" is unchecked
            System.out.println("The 'Remember Me' checkbox is checked: " + isRememberMeChecked);
            //assert if condition is true
            ReusableMethods_Loggers.isConditionFalse(isRememberMeChecked, logger);
            //switch back to main tab
            ReusableMethods_Loggers.switchtabByIndex(driver,0,logger);
        }//end of tc 01


        @Test (priority = 2)
        public void tc002_verifyTermsAndConditions() throws InterruptedException {
            //navigate to Caresource landing page
            driver.navigate().to("https://www.caresource.com/");
            //hover over "About Us" dropdown
            ReusableMethods_Loggers.hoverMethod(driver,logger,driver.findElement(By.id("menu-item-105377")) );
            //click on "Terms and Conditions" button
            ReusableMethods_Loggers.clickMethod(driver, "//*[text() = 'Terms and Conditions']", "Terms and Conditions",  logger);
            //sleep
            Thread.sleep(3000);
            //store Terms and Conditions text into a boolean variable as proof of display
            boolean isTACDisplayed = driver.findElement(By.xpath("//*[@id = 'mainbar']")).isDisplayed();
            //print out if checkbox "Remember Me" is unchecked
            System.out.println("Terms and Conditions are displayed on site: " + isTACDisplayed);
            //assert if condition is true
            ReusableMethods_Loggers.isConditionTrue(isTACDisplayed, logger);
            //switch back to main tab
            ReusableMethods_Loggers.switchtabByIndex(driver,0,logger);
        }//end of tc 02

        @Test (priority = 3)
        public void tc003_verifyRSCStatement() throws InterruptedException {
            //navigate to Caresource landing page
            driver.navigate().to("https://www.caresource.com/");
            //hover over "About Us" dropdown
            ReusableMethods_Loggers.hoverMethod(driver,logger,driver.findElement(By.id("menu-item-105377")) );
            //click on "Responsible Disclosure Statement"
            ReusableMethods_Loggers.clickMethod(driver, "//*[text() = 'Responsible Disclosure Statement']", "RSC Button",  logger);
            //store the RSC Statement Box to confirm presence
            boolean RSCStatement = driver.findElement(By.xpath("//*[@id = 'mainbar']")).isDisplayed();
            //print statement
            System.out.println("The RSC Statement is displaying on site: " + RSCStatement);
            //assert if condition is true
            ReusableMethods_Loggers.isConditionTrue(RSCStatement, logger);
            //switch back to main tab
            ReusableMethods_Loggers.switchtabByIndex(driver,0,logger);
        }//end of tc 03


        @Test (priority = 4)
        public void tc004verifyMichiganProviderNewTab () throws InterruptedException {
            //navigate to Caresource landing page
            driver.navigate().to("https://www.caresource.com/");
            //hover over "Login" dropdown
            ReusableMethods_Loggers.hoverMethod(driver,logger,driver.findElement(By.id("menu-item-82594")) );
            //click on "Provider in MI" button
            ReusableMethods_Loggers.clickMethod(driver, "//*[text() = 'Provider in MI']", "Provider in MI Button",  logger);
            //sleep
            Thread.sleep(3000);
            //store the main header to confirm hyperlink works
            boolean isHAPHeaderPresent = driver.findElement(By.xpath("//*[@id = 'main-header']")).isDisplayed();
            //print out if checkbox "Remember Me" is unchecked
            System.out.println("The HAP Hyperlink for Providers in MI is functioning: " + isHAPHeaderPresent);
            //assert if condition is true
            ReusableMethods_Loggers.isConditionTrue(isHAPHeaderPresent, logger);
            //switch back to main tab
            ReusableMethods_Loggers.switchtabByIndex(driver,0,logger);
        }//end of tc 04


        @Test (priority = 5)
        public void tc005verifyCorpCompliancePDF () throws InterruptedException {
            //navigate to Caresource landing page
            driver.navigate().to("https://www.caresource.com/");
            //hover over "About Us" dropdown
            ReusableMethods_Loggers.hoverMethod(driver,logger,driver.findElement(By.id("menu-item-105377")) );
            //click on "Corporate Compliance" button
            ReusableMethods_Loggers.clickMethod(driver, "//*[text() = 'Corporate Compliance']", "Corporate Compliance Button",  logger);
            //sleep
            Thread.sleep(3000);
            //click on "Corporate Compliance" hyperlink
            ReusableMethods_Loggers.clickMethod(driver, "//*[@id = 'corporate-compliance-plan']", "Corporate Compliance Link",  logger);
            //switch to PDF tab
            ReusableMethods_Loggers.switchtabByIndex(driver,1,logger);
            //switch back to original tab
            ReusableMethods_Loggers.switchtabByIndex(driver,0,logger);
            //sleep
            Thread.sleep(3000);
            //store the pdf xpath of the Corporate Compliance PDF to verify accessibility
            boolean isCCPDFPresent = driver.findElement(By.xpath("//*[@id= 'corporate-compliance-plan']")).isDisplayed();
            //print out if checkbox "Remember Me" is unchecked
            System.out.println("Access to Corporate Compliance PDF Hyperlink is functioning: " + isCCPDFPresent);
            ReusableMethods_Loggers.isConditionTrue(isCCPDFPresent, logger);
            driver.close();
        }//end of tc 05


    }//end of class