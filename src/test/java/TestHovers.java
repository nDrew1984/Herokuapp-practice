import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestHovers extends BaseTest {

    @Test
    public void TestUser1() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickHovers();

        String expUrl = "https://the-internet.herokuapp.com/hovers";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        HoversPage hovers = new HoversPage(driver);
        hovers.clickUser1Profile();

        String exp = "https://the-internet.herokuapp.com/users/1";
        String act = driver.getCurrentUrl();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestAllUsers() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickHovers();

        String expUrl = "https://the-internet.herokuapp.com/hovers";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        HoversPage hovers = new HoversPage(driver);
        hovers.clickAllProfiles();


        Map<String, String> exp = new HashMap<>();
        exp.put("user1", "https://the-internet.herokuapp.com/users/1");
        exp.put("user2", "https://the-internet.herokuapp.com/users/2");
        exp.put("user3", "https://the-internet.herokuapp.com/users/3");

        Map<String, String> act = new HashMap<>();
        for (int i = 0; i < hovers.getUserList().size(); i++) {
            act.put(hovers.getUserList().get(i), hovers.getUserLinks().get(i));
        }

        Assertions.assertEquals(exp, act);
    }
}
