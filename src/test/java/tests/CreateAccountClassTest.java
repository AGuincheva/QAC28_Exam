package tests;

import core.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.RegistrationPage;
import utils.WaitTool;

public class CreateAccountClassTest extends BaseTest {
    @Test
    public static void loginSuccessfully() {
        CreateAccountPage.goToHomePage();
        CreateAccountPage.clickOnMyAccountToRegister();
        RegistrationPage.firstNameField("Alabala");
        RegistrationPage.lastNameField("Dryn");
        RegistrationPage.emailField();
        RegistrationPage.phoneNumberField();
        RegistrationPage.passwordField();
        RegistrationPage.agreeCheckbox();
        RegistrationPage.continueButton();
        RegistrationPage.verifyingLabelText("Your Account Has Been Created!");

    }
}
