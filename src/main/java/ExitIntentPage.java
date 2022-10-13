import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.awt.*;


public class ExitIntentPage extends BasePage {
    public ExitIntentPage(WebDriver driver) {
        super(driver);
    }

    private final By closeModalButton = By.xpath("//*[@class=\"modal-footer\"]/p");

    public void clickCloseModal() {
        driver.findElement(closeModalButton).click();
    }
    public void moveCursor(int x, int y) throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(x, y);
    }
    public boolean isWindowAppear() {
        return driver.findElement(closeModalButton).isDisplayed();
    }
}
