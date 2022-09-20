import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertPage extends BasePage {
    public JavascriptAlertPage(WebDriver driver) {
        super(driver);
    }

    private final By JsAlert = By.xpath("//*[@onclick=\"jsAlert()\"]");
    private final By JsConfirm = By.xpath("//*[@onclick=\"jsConfirm()\"]");
    private final By JsPrompt = By.xpath("//*[@onclick=\"jsPrompt()\"]");
    private final By result = By.id("result");

    public void clickJsAlert() {
        driver.findElement(JsAlert).click();
    }
    public void clickAlertOK() {
        driver.switchTo().alert().accept();
    }
    public void clickJsConfirm() {
        driver.findElement(JsConfirm).click();
    }
    public void clickAlertCancel() {
        driver.switchTo().alert().dismiss();
    }
    public void clickJsPrompt() {
        driver.findElement(JsPrompt).click();
    }
    public void writePrompt(String s) {
        driver.switchTo().alert().sendKeys(s);
    }
    public String getResult() {
        return driver.findElement(result).getText();
    }
}
