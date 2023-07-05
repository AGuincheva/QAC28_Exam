package pages;

import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utils.WaitTool;

public class CreateAccountPage extends BasePage {

   private static final String HOMEPAGE_URL = "http://shop.pragmatic.bg";
   private static final By ACCOUNT_BUTTON_LOCATOR = By.xpath("//i[@class='fa fa-user']//following::span[@class='hidden-xs hidden-sm hidden-md'][1]");
   private static final By REGISTER_BUTTON_LOCATOR = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/li[1]/a");


   public static void goToHomePage() {
      driver.get("http://shop.pragmatic.bg");
   }

   public static void clickOnMyAccountToRegister(){
      WebElement accountButton = driver.findElement(ACCOUNT_BUTTON_LOCATOR);
      clickOnElement(accountButton);
      WebElement registerButton = driver.findElement(REGISTER_BUTTON_LOCATOR);
      clickOnElement(registerButton);
      WaitTool.waitToBeVisible(driver, By.id("input-firstname"), 10);
   }
}