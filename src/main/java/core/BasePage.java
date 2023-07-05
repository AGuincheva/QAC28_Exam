package core;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Browser;

public abstract class BasePage {
    protected static WebDriver driver;

    static {
        driver = Browser.getDriver();
    }

    public static void clickOnElement(WebElement element) {
        element.click();
    }

    public static void clickOnElementByLocator(By locator) {
        driver.findElement(locator).click();
    }

    public static void sendKeysElement(WebElement element, String keys) {
        element.sendKeys(keys);
    }

    public static void sendKeysElementByLocator(By locator, String keys) {
        driver.findElement(locator).sendKeys(keys);
    }
//    public static void randomStringUtilsAlphabetic(int str) {
//        RandomStringUtils.randomAlphabetic(str);
//    }
//    public static void randomStringUtilsNumeric(int num) {
//        RandomStringUtils.randomNumeric(num);
//    }
//    public static void randomStringUtilsAlphaNumeric(int sn) {
//        RandomStringUtils.randomAlphanumeric(sn);
//
//    }

}
