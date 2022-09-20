import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    private final By boxA = By.id("column-a");
    private final By boxB = By.id("column-b");

    public void dragDrop() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(boxA), driver.findElement(boxB))
                .pause(Duration.ofSeconds(2))
                .build()
                .perform();
    }
}
