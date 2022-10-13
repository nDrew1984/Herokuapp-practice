import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWYSIWYGEditorPage extends BaseTest {

    @Test
    public void TestWYSIWYGEditorPageLoad() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickWYSIWYGEditor();

        String expUrl = "https://the-internet.herokuapp.com/tinymce";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);
    }

    @Test
    @Description("Testing new file and formatting.")
    public void TestFormat() {
        TestWYSIWYGEditorPageLoad();

        WYSIWYGEditorPage editor = new WYSIWYGEditorPage(driver);
        driver.switchTo().frame("mce_0_ifr");
        //editor.selectFile("New document");

        String text = "Adrienn";

        editor.writeText(text);
        driver.switchTo().defaultContent();
        editor.selectAll();
        editor.selectBold();
    }
}
