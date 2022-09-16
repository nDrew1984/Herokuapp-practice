import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDropdown extends BaseTest {

    @Test
    public void TestDropdownList() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickDropdown();

        String expUrl = "https://the-internet.herokuapp.com/dropdown";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        DropdownPage drop = new DropdownPage(driver);

        String exp = "Option 2";
        drop.selectOption(exp);

        String act = drop.getSelected();
        Assertions.assertEquals(exp, act);
    }
}
