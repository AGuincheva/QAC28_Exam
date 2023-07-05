package pages;

import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.WaitTool;

public class RegistrationPage extends BasePage {

    private static final By LAST_NAME_FIELD_LOCATOR = By.id("input-lastname");
    private static final By FIRST_NAME_FIELD_LOCATOR = By.id("input-firstname");
    private static final By EMAIL_FIELD_LOCATOR = By.id("input-email");
    private static final By PHONE_NUMBER_FIELD_LOCATOR = By.id("input-telephone");
    private static final By PASSWORD_FIELD_LOCATOR = By.id("input-password");
    private static final By AGREE_CHECKBOX_LOCATOR = By.xpath("//input[@name='agree']");
    private static final By CONTINUE_BUTTON_LOCATOR = By.xpath("//input[@class='btn btn-primary']");
    private static final By ASSERT_TEXT_LOCATOR = By.xpath("//div[@id='content']/h1");

    public static void firstNameField(String firstName){
        WaitTool.waitToBeVisible(driver, By.id("input-firstname"), 10);
        WebElement firstNameField = driver.findElement(FIRST_NAME_FIELD_LOCATOR);
        sendKeysElement(firstNameField, firstName);
    }

    public static void lastNameField(String lastName) {
        WebElement lastNameField = driver.findElement(LAST_NAME_FIELD_LOCATOR);
        sendKeysElement(lastNameField, lastName);
    }
    public static void emailField(){
        WebElement emailField = driver.findElement(EMAIL_FIELD_LOCATOR);
        String prefix = RandomStringUtils.randomAlphabetic(5);
        String sufix = RandomStringUtils.randomAlphabetic(4);
        String email = prefix + "@" + sufix + ".com";
        sendKeysElement(emailField, email);
    }
    public static void phoneNumberField(){
        WebElement phoneNumberField = driver.findElement(PHONE_NUMBER_FIELD_LOCATOR);
        String phone = RandomStringUtils.randomNumeric(6);
        String phoneNumber = "0888" + phone;
        sendKeysElement(phoneNumberField, phoneNumber);
    }
    public static void passwordField(){
        WebElement passwordField = driver.findElement(PASSWORD_FIELD_LOCATOR);
        String pass = RandomStringUtils.randomAlphanumeric(10);
        String password = pass;
        sendKeysElement(passwordField, password);
        WebElement confirmPasswordField = driver.findElement(PASSWORD_FIELD_LOCATOR);
        sendKeysElement(confirmPasswordField, password);
    }
    public static void agreeCheckbox(){
        WebElement agreeCheckbox = driver.findElement(AGREE_CHECKBOX_LOCATOR);
        if (!agreeCheckbox.isSelected()){
            clickOnElement(agreeCheckbox);
        }
    }
    public static void continueButton(){
        WebElement continueButton = driver.findElement(CONTINUE_BUTTON_LOCATOR);
        clickOnElement(continueButton);
    }
    public static void verifyingLabelText(String expectedUsernameLabelText) {
        WaitTool.waitToBeVisible(driver,(By.xpath("//div[@id='content']/h1")), 10);
        WebElement assertText = driver.findElement(ASSERT_TEXT_LOCATOR);
        String text = assertText.getText();
        Assert.assertEquals(text, expectedUsernameLabelText);
    }
}
