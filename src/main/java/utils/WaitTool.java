package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTool {

    public static WebElement waitToBeVisible(WebDriver driver, By locator, long timeToWait) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeToWait));
        WebElement foundElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return foundElement;
    }
}
