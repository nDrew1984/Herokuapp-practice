import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExitIntent extends BaseTest {

    @Test
    public void TestPageLoad() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickExitIntent();

        String expUrl = "https://the-internet.herokuapp.com/exit_intent";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);
    }

    @Test
    public void TestIntent() {
        TestPageLoad();
        ExitIntentPage exitIntent = new ExitIntentPage(driver);

        // try this: https://www.guru99.com/using-robot-api-selenium.html
        int x = 250;
        int y = 0;
        exitIntent.moveCursor(x, y);
    }
}
