import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestFloatingMenu extends BaseTest {

    @Test
    public void TestFloating() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickFloatingMenu();

        String expUrl = "https://the-internet.herokuapp.com/floating_menu";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        FloatingMenuPage floating = new FloatingMenuPage(driver);

        // expected- and actual result:
        // We click to all menu buttons, and check that they lead to correct links:
        Map<String, String> exp = new HashMap<>();
        exp.put("Home", "https://the-internet.herokuapp.com/floating_menu#home");
        exp.put("News", "https://the-internet.herokuapp.com/floating_menu#news");
        exp.put("Contact", "https://the-internet.herokuapp.com/floating_menu#contact");
        exp.put("About", "https://the-internet.herokuapp.com/floating_menu#about");
        Map<String, String> act = floating.clickAllMenu();

        Assertions.assertEquals(exp, act);


    }
}
