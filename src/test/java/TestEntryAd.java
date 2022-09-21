import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestEntryAd extends BaseTest {

    @Test
    public void TestPageLoad() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickEntryAd();

        String expUrl = "https://the-internet.herokuapp.com/entry_ad";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);
    }

    @Test
    public void TestModalWindow() throws InterruptedException {
        TestPageLoad();
        EntryAdPAge entryAd = new EntryAdPAge(driver);
        try {
            entryAd.clickCloseModal();
        } catch (NoAlertPresentException e) {
            e.printStackTrace();
        }
        Thread.sleep(500);
        entryAd.clickClickHere();
        driver.navigate().refresh();
        Thread.sleep(500);

        boolean act = entryAd.isModalDisplayed();
        Assertions.assertTrue(act);
    }
}
