import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFormAuthentication extends BaseTest {

    @Test
    @Description("Testing the Login function with valid data, then logout, then testing with invalid test data.")
    public void TestLogin() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickFormAuthentication();

        String expUrl = "https://the-internet.herokuapp.com/login";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        FormAuthenticationPage loginPage = new FormAuthenticationPage(driver);

        // valid test data:
        String username = "tomsmith";
        String password = "SuperSecretPassword!";

        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();

        String exp = "You logged into a secure area!";
        String act = loginPage.getFlashText().substring(0, exp.length());
        Assertions.assertEquals(exp, act);

        loginPage.clickLogout();
        Assertions.assertEquals(expUrl, actUrl);

        // invalid test data:
        String invalidUsername = "asd";
        String invalidPassword = "asd";
        loginPage.enterUsername(invalidUsername);
        loginPage.enterPassword(invalidPassword);
        loginPage.clickLogin();

        String expError = "Your username is invalid!";
        String actError = loginPage.getFlashText().substring(0, expError.length());
        Assertions.assertEquals(expError, actError);
    }
}
