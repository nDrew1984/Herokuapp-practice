import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDynamicControls extends BaseTest {

    @Test
    public void TestDynamicCheckbox() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickDynamicControls();

        String expUrl = "https://the-internet.herokuapp.com/dynamic_controls";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        DynamicControlsPage controls = new DynamicControlsPage(driver);
        controls.clickCheckbox();
        controls.clickCheckboxButton();

        String exp = "It's gone!";
        String act = controls.getTextResult();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestDynamicInput() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickDynamicControls();

        String expUrl = "https://the-internet.herokuapp.com/dynamic_controls";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        DynamicControlsPage controls = new DynamicControlsPage(driver);
        controls.clickInputButton();

        String exp = "It's enabled!";
        String act = controls.getTextResult();
        Assertions.assertEquals(exp, act);

        String text = "Adrienn";
        controls.writeInputField(text);
        controls.clickInputButton();
        exp = "It's disabled!";
        act = controls.getTextResult();
        Assertions.assertEquals(exp, act);
    }
}
