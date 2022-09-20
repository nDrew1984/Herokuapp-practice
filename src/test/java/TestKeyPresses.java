import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestKeyPresses extends BaseTest {

    @Test
    public void TestKeyPress() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickKeyPresses();

        String expUrl = "https://the-internet.herokuapp.com/key_presses";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        String keys = "%%%";
        KeyPressesPage keyPress = new KeyPressesPage(driver);
        keyPress.clickInto(keys);

        String exp = "You entered: " + keys.charAt(keys.length()-1);
        String act = keyPress.getResult();
        Assertions.assertEquals(exp, act);

    }
}
