import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTypos extends BaseTest {

    @Test
    public void TestTyposPageLoad() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickTypos();

        String expUrl = "https://the-internet.herokuapp.com/typos";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);
    }

    @Test
    public void TestSpelling() {
        TestTyposPageLoad();
        TyposPage typos = new TyposPage(driver);

        SpellChecker checker = new SpellChecker();
        //https://stackoverflow.com/questions/29349688/selenium-webdriver-spell-check

    }
}
