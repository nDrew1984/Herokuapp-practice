import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBasicAuthPage extends BaseTest {

    @Test
    public void TestBasicAuth() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickBasicAuth();

        String exp1 = "http://the-internet.herokuapp.com/basic_auth";
        String act1 = driver.getCurrentUrl();
        Assertions.assertEquals(exp1, act1);

        BasicAuthPage auth = new BasicAuthPage(driver);
        String username = "admin";
        String password = "admin";

        auth.login(username, password);

        String exp2 = "Congratulations! You must have the proper credentials.";
        String act2 = auth.getMessage();
        Assertions.assertEquals(exp2, act2);
    }
}
