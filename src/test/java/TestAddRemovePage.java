import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAddRemovePage extends BaseTest {

    @Test
    public void TestAddRemove() {
        BasePage basePage = new BasePage(driver);
        basePage.navigate();
        basePage.clickAddRemoveElements();

        String exp1 = "http://the-internet.herokuapp.com/add_remove_elements/";
        String act1 = driver.getCurrentUrl();
        Assertions.assertEquals(exp1, act1);

        AddRemovePage addRemove = new AddRemovePage(driver);
        addRemove.clickAddElement(36);  // click Add Element button 36 times
        addRemove.clickNthRemove(12);   // remove the 12th, 1st and the 13th Remove buttons by clicking on them
        addRemove.clickNthRemove(1);
        addRemove.clickNthRemove(13);

        int exp2 = 33;
        int act2 = addRemove.numberOfRemoves(); // checking that there are 3 less Remove button
    }
}
