import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMultipleWindows extends BaseTest {

    @Test
    public void TestWindows() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickMultipleWindows();
        Assertions.assertEquals("https://the-internet.herokuapp.com/windows", driver.getCurrentUrl());

        MultipleWindowsPage page = new MultipleWindowsPage(driver);
        page.clickClickHere();

        String exp = "New Window";
        String act = page.getNewWindowText();
        Assertions.assertEquals(exp, act);
        driver.close();
    }
}
