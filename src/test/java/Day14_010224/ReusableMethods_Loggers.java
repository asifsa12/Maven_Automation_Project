package Day14_010224;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.ArrayList;

public class ReusableMethods_Loggers {
    //create a CLICK method to click on any web element
    public static void clickMethod(WebDriver driver, String xpath, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
            logger.log(LogStatus.PASS,"Successfully clicked on " + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL,"unable to click on " + elementName);
            getScreenShot(driver,elementName,logger);
        }
    }//end of click method


    //send keys click get text
    //create a GET TEXT METHOD
    public static String captureText(WebDriver driver, String xpath, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = "";
        try {
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
            logger.log(LogStatus.PASS,"Successfully acquired text of" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to get text " + ":" + e);
            logger.log(LogStatus.FAIL,"Unable to acquire text of" + elementName);
        }
        return result;
    }//end of capture text method


    //create a CLICK BY INDEX METHOD to click on any web element by index
        public static void clickByIndexMethod(WebDriver driver, String xpath, int index, String elementName, ExtentTest logger) {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            try {
                wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
                logger.log(LogStatus.PASS,"Successfully clicked on " + elementName);
            } catch (Exception e) {
                System.out.println("Unable to click on element " + elementName + ":" + e);
                logger.log(LogStatus.FAIL,"Unable to click on element" + elementName + ":" + e);
            }
            return;
        }//end of click by index method



    //create a SCROLL method
    public static void scrollIntoViewMethod(WebDriver driver, String xpath, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jse.executeScript("arguments[0].scrollIntoView[true];", element);
            logger.log(LogStatus.PASS,"Successfully scrolled to " + elementName);
        } catch (Exception e) {
            System.out.println("unable to scroll to element " + elementName + ":" + e);
            logger.log(LogStatus.FAIL,"Unable to scroll to " + elementName);
        }//end of exception
    }//end of scroll method



    //create a SEND KEYS method
    public static void sendKeys(WebDriver driver, String xpath,String elementName, String Text, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(Text);
            logger.log(LogStatus.PASS,"Successfully sent keys" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to send keys" + elementName + ":" + e);
            logger.log(LogStatus.FAIL,"unable to send keys " + elementName + ":" + e);
            getScreenShot(driver,elementName,logger);
        }
        return;
    }//end of send keys method



    //create a BOOLEAN (isconditiontrue) method
    public static void isConditionTrue(boolean bool, ExtentTest logger){
        // original code was if (bool == true)
        if(bool== true) {
            logger.log(LogStatus.PASS, "Boolean Condition is " + true);
        } else {
            logger.log(LogStatus.FAIL, "Boolean Condition is " + false);
        }
    }//end of isConditionTrue method


    //create a BOOLEAN (isconditionfalse) method
    public static void isConditionFalse (boolean bool, ExtentTest logger){

        if(bool== false) {
            logger.log(LogStatus.PASS, "Boolean Condition is " + false);
        } else {
            logger.log(LogStatus.FAIL, "Boolean Condition is " + true);
        }
    }//end of isConditionTrue method




    //create a SUBMIT method
    public static void submitMethod (WebDriver driver,String xpath, String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
            logger.log(LogStatus.PASS,"Successfully submitted" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to submit " + elementName + ":" + e);
            logger.log(LogStatus.FAIL,"Unable to submit " + elementName + ":" + e);
            getScreenShot(driver,elementName,logger);
        }
        return;
    }//end of submit method



    //create a SWITCHTOTAB method
    public static void switchtabByIndex (WebDriver driver, int tabIndex, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(tabIndex));
            logger.log(LogStatus.PASS,"Successfully switched to tab by index");
        } catch (Exception e) {
            System.out.println("Unable to switch tabs by index " + ":" + e);
            logger.log(LogStatus.FAIL,"Unable to switch tabs by index " + ":" + e);
        }//
    }//end of switch tab method



    //create a HOVER method
    public static void hoverMethod (WebDriver driver, ExtentTest logger,WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).perform();
            logger.log(LogStatus.PASS,"Successfully hovered over element");
        } catch (Exception e) {
            System.out.println("Unable to hover over element" + ":" + e);
            logger.log(LogStatus.FAIL,"Unable to hover over element" + ":" + e);
        }//
    }//end of hover method



    //create a SCROLLBYPIXEL method
    public static void scrollByPixel (WebDriver driver, int pixelscroll, ExtentTest logger ) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            String script = String.format("scrollBy(0, %s);", pixelscroll);
            jse.executeScript(script);
            logger.log(LogStatus.PASS,"Successfully scrolled by pixel");
        } catch (Exception e) {
            System.out.println("Unable to scroll by pixel" + ":" + e);
            logger.log(LogStatus.FAIL,"Unable to scroll by pixel" + ":" + e);
        }//
    }//end of scroll by pixel method



    //create a SELECTBYVISIBLETEXT method
    public static void selectByVisibleText(WebDriver driver, String xpath, String visibleText , String elementName, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByVisibleText(String.valueOf(visibleText));
            logger.log (LogStatus.PASS,"Successfully selected by visible text" + elementName);
        }catch (Exception e) {
            System.out.println("Unable to select by the visible text " + elementName + ":" + e);
            logger.log (LogStatus.FAIL,"Unable to select by the visible text " + elementName + ":" + e);
        }
    }//end of select method



    //create a CLICKBYJSE METHOD
    public static void clickByJseMethod (WebDriver driver, String xpath, ExtentTest logger, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        try {
            jse.executeScript("arguments[0].click();",element);
            logger.log(LogStatus.PASS,"Successfully clicked on element by JSE method" + elementName);
        } catch (Exception e) {
            System.out.println("Unable to click on element using jse because of " + elementName + ":" + e);
            logger.log(LogStatus.FAIL,"Unable to click on element using jse because of " + elementName + ":" + e);
        }
    }//end of method



    //create a GETURL method
    public static void getURLMethod (WebDriver driver, String Url, ExtentTest logger) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            String currentURL = driver.getCurrentUrl();
            logger.log(LogStatus.PASS,"Captured URL: " + Url);
        } catch (Exception e) {
            System.out.println("Unable to get url because of " + e);
            logger.log(LogStatus.FAIL,"Unable to get url because of " + e);
        }
    }//end of method



    //create a GETSCREENSHOT method
    public static void getScreenShot(WebDriver driver, String imageName, ExtentTest logger) {
        try {
            String fileName = imageName + ".png";
            String directory = null;
            String snPath = null;
            directory = "src/main/java/HTML_Report/Screenshots/";
            snPath = "Screenshots//";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));
            String image = logger.addScreenCapture(snPath + fileName);
            logger.log(LogStatus.FAIL, "", image);
        } catch (Exception e) {
            logger.log(LogStatus.FAIL, "Error occurred while taking SCREENSHOT!!!");
            e.printStackTrace();
        }
    }//end of getScreenshot method

}//end of class
