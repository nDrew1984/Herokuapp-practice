import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestContextMenu extends BaseTest {

    @Test
    public void TestContext() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickContextMenu();

        Assertions.assertEquals("https://the-internet.herokuapp.com/context_menu", driver.getCurrentUrl());

        ContextMenuPage context = new ContextMenuPage(driver);
        context.rightClickField();

        String exp = "You selected a context menu";
        String act = context.getAlertText();
        Assertions.assertEquals(exp, act);

        context.clickOK();
    }
}
