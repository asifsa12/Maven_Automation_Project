package actionitems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class Reusable_Methods {
    //Think of reusable methods as your toolkit. A plumber or engineer has their toolkit
    //They bring this toolkit onsite to help them no matter the situation
    //You can reference these "tools" and copy and paste them into your projects
    //this is useful for automation projects, especially work related ones


    //setup DRIVER RETURN METHOD (naming convention)
    public static WebDriver setUpDriver() {
        //setup your chromedriver with webdrivermanager
        WebDriverManager.chromedriver().setup();
        //declare chrome options variable
        ChromeOptions options = new ChromeOptions();
        //maximize for windows
        options.addArguments("start-maximized");
        //open in incognito mode
        options.addArguments("incognito");
        //define the webdriver
        WebDriver driver = new ChromeDriver(options);
        //return a driver instance
        return driver;
    }//end of setup driver method


    //CLICK METHOD
    public static void clickMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName);
        }
    }//end of submit method


    //GET TEXT METHOD
    public static String captureText(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String result = "";
        try {
            result = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();
        } catch (Exception e) {
            System.out.println("Unable to get text " + ":" + e);
        }
        return result;
    }//end of capture text method


    //create a CLICK BY INDEX METHOD to click on any web element by index
    public static void clickByIndexMethod(WebDriver driver, String xpath, int index, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath))).get(index).click();
        } catch (Exception e) {
            System.out.println("Unable to click on element " + elementName + ":" + e);
        }
        return;
    }//end of click by index method


    //create a SCROLL method
    public static void scrollMethod(WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            jse.executeScript("arguments[0].scrollIntoView[true];", element);
        } catch (Exception e) {
            System.out.println("unable to scroll to element " + elementName + ":" + e);
    }//end of exception
}//end of scroll method

    //create a SEND KEYS method
    public static void sendKeys(WebDriver driver, String xpath,String elementName, String Text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(Text);
        } catch (Exception e) {
            System.out.println("Unable to send keys" + elementName + ":" + e);
        }
        return;
    }//end of send keys method

    //create a SUBMIT method
    public static void submitMethod (WebDriver driver,String xpath,String elementName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).submit();
        } catch (Exception e) {
            System.out.println("Unable to submit " + elementName + ":" + e);
        }
        return;
    }//end of submit method


    //create a SWITCHTOTAB method
    public static void switchtabByIndex (WebDriver driver, int tabIndex) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
    try {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(tabIndex));
    } catch (Exception e) {
        System.out.println("Unable to switch tabs by index " + ":" + e);
    }//
    }//end of switch tab method

    //create a SCROLLBYPIXEL method
    public static void scrollBypixel (WebDriver driver,String pixelScroll ) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        try {
            jse.executeScript(pixelScroll);
        } catch (Exception e) {
            System.out.println("Unable to scroll by pixel" + ":" + e);
        }//
    }//end of scroll by pixel method


    //create a SELECTBYVISIBLETEXT method
    public static void selectByVisibleText(WebDriver driver, String xpath, String visibleText, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            Select elementDropdown = new Select(element);
            elementDropdown.selectByVisibleText(visibleText);
        }catch (Exception e) {
            System.out.println("Unable to select by the visible text " + elementName + ":" + e);
        }
    }//end of select method


    //create a CLICKBYJSE METHOD
    public static void clickByJseMethod (WebDriver driver, String xpath, String elementName) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
            WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            try {
                jse.executeScript("arguments[0].click();",element);
            } catch (Exception e) {
                System.out.println("Unable to click on element using jse because of " + elementName + ":" + e);
            }
    }//end of method

    //create a GETURL METHOD
    public static void getURLMethod (WebDriver driver, String Url) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        try {
            String currentURL = driver.getCurrentUrl();
            System.out.println("Captured URL: " + Url);
        } catch (Exception e) {
            System.out.println("Unable to get url because of " + e);
        } // end of try catch
    }//end of method





}//end of class
