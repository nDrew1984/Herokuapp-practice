import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCheckboxes extends BaseTest {

    @Test
    public void TestCheckbox() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickCheckboxes();

        String expUrl = "https://the-internet.herokuapp.com/checkboxes";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        CheckboxPage checkbox = new CheckboxPage(driver);
        checkbox.clickAllUnchecked();
        Assertions.assertTrue(checkbox.isAllSelected());

        checkbox.clickAllChecked();
        Assertions.assertFalse(checkbox.isAllSelected());

    }
}
