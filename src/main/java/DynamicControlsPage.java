import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControlsPage extends BasePage {
    public DynamicControlsPage(WebDriver driver) {
        super(driver);
    }

    private final By checkbox = By.xpath("//*[@id=\"checkbox\"]/input");
    private final By checkboxButton = By.xpath("//*[@id=\"checkbox-example\"]/button");
    private final By inputField = By.xpath("//*[@id=\"input-example\"]/input");
    private final By inputButton = By.xpath("//*[@id=\"input-example\"]/button");
    private final By message = By.id("message");

    public void clickCheckboxButton() {
        driver.findElement(checkboxButton).click();
    }
    public void clickCheckbox() {
        driver.findElement(checkbox).click();
    }
    public void clickInputButton() {
        driver.findElement(inputButton).click();
    }
    public void writeInputField(String s) {
        driver.findElement(inputField).sendKeys(s);
    }
    public String getTextResult() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(message));
        return driver.findElement(message).getText();
    }
}
