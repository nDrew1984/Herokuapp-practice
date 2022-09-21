import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ExitIntentPage extends BasePage {
    public ExitIntentPage(WebDriver driver) {
        super(driver);
    }

    private final By closeModalButton = By.xpath("//*[@class=\"modal-footer\"]/p");

    public void clickCloseModal() {
        driver.findElement(closeModalButton).click();
    }
    public void moveCursor(int x, int y) {
        Actions actions = new Actions(driver);
        actions.moveByOffset(x, y)
                .contextClick()
                .build()
                .perform();
    }
}
