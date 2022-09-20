import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestJavascriptAlerts extends BaseTest {

    @Test
    public void TestJsAlert() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickJavascriptAlerts();

        String expUrl = "https://the-internet.herokuapp.com/javascript_alerts";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        JavascriptAlertPage jsPage = new JavascriptAlertPage(driver);

        // testing Alert window:
        jsPage.clickJsAlert();
        jsPage.clickAlertOK();
        String exp = "You successfully clicked an alert";
        String act = jsPage.getResult();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestJsConfirmOK() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickJavascriptAlerts();

        String expUrl = "https://the-internet.herokuapp.com/javascript_alerts";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        JavascriptAlertPage jsPage = new JavascriptAlertPage(driver);

        // testing Confirm window, clicking OK button:
        jsPage.clickJsConfirm();
        jsPage.clickAlertOK();
        String exp = "You clicked: Ok";
        String act = jsPage.getResult();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestJsConfirmCancel() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickJavascriptAlerts();

        String expUrl = "https://the-internet.herokuapp.com/javascript_alerts";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        JavascriptAlertPage jsPage = new JavascriptAlertPage(driver);

        // testing Confirm window, clicking CANCEL button:
        jsPage.clickJsConfirm();
        jsPage.clickAlertCancel();
        String exp = "You clicked: Cancel";
        String act = jsPage.getResult();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestJsPrompt() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickJavascriptAlerts();

        String expUrl = "https://the-internet.herokuapp.com/javascript_alerts";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        JavascriptAlertPage jsPage = new JavascriptAlertPage(driver);

        // testing Prompt window, writing in, and clicking OK button:
        jsPage.clickJsPrompt();
        String text = "ADRIENN";
        jsPage.writePrompt(text);
        jsPage.clickAlertOK();
        String exp = "You entered: " + text;
        String act = jsPage.getResult();
        Assertions.assertEquals(exp, act);
    }
}
