import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage {
    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    private final By contextField = By.id("hot-spot");

    public void rightClickField() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(contextField))
                .contextClick()
                .build()
                .perform();
    }
    public void clickOK() {
        driver.switchTo().alert().accept();
    }
    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }
}
