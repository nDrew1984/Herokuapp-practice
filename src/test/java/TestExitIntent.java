import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

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
    public void TestIntent() throws AWTException, InterruptedException {
        TestPageLoad();
        ExitIntentPage exitIntent = new ExitIntentPage(driver);

        int x1 = 250;
        int y1 = 250;
        exitIntent.moveCursor(x1, y1);

        Thread.sleep(2000);
        int x2 = 250;
        int y2 = 50;
        exitIntent.moveCursor(x2, y2);

        boolean act = exitIntent.isWindowAppear();
        Assertions.assertTrue(act);

        exitIntent.clickCloseModal();
    }
}
