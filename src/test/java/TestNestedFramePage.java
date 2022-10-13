import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class TestNestedFramePage extends BaseTest {

    @Test
    public void TestNestedFramePageLoad() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickNestedFrame();

        String expUrl = "https://the-internet.herokuapp.com/nested_frames";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);
    }

    @Test
    public void TestNestedFrames() {
        TestNestedFramePageLoad();

        NestedFramesPage nested = new NestedFramesPage(driver);
        List<String> act = new ArrayList<>();
        List<String> exp = new ArrayList<>();

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        act.add(nested.getFrameText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        act.add(nested.getFrameText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-right");
        act.add(nested.getFrameText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        act.add(nested.getFrameText());

        exp.add("LEFT");
        exp.add("MIDDLE");
        exp.add("RIGHT");
        exp.add("BOTTOM");

        Assertions.assertLinesMatch(exp, act);
    }
}
