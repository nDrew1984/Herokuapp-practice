import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFrames extends BaseTest {

    @Test
    public void TestIFramePageLoad() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickFrames();
        FramesPage frames = new FramesPage(driver);
        frames.clickIFrames();

        String expUrl = "https://the-internet.herokuapp.com/iframe";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);
    }

    @Test
    public void TestIFrame() {
        TestIFramePageLoad();
        FramesPage frames = new FramesPage(driver);
        driver.switchTo().frame("mce_0_ifr");

        String text = "Adrienn";
        frames.writeText(text);
    }
}
