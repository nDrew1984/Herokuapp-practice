import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyPressesPage extends BasePage {
    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    private final By inputField = By.id("target");
    private final By output = By.id("result");

    public void clickInto(String s) {
        Actions actions = new Actions(driver);
        actions.sendKeys(driver.findElement(inputField), s)
                .build()
                .perform();
    }
    public String getResult() {
        return driver.findElement(output).getText();
    }
}
