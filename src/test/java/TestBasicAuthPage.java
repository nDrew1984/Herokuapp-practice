import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBasicAuthPage extends BaseTest {

    @Test
    public void TestBasicAuth1() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickBasicAuth();

        String expUrl = "https://the-internet.herokuapp.com/basic_auth";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        BasicAuthPage auth = new BasicAuthPage(driver);
        String username = "admin";
        String password = "admin";

        auth.login(username, password);

        String exp = "Congratulations! You must have the proper credentials.";
        String act = auth.getSuccessMessage();
        Assertions.assertEquals(exp, act);
    }
}
