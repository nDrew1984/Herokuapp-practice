import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    private final By boxA = By.id("column-a");
    private final By boxB = By.id("column-b");

    public void dragDrop() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(boxA), driver.findElement(boxB))
                .build()
                .perform();
    }
    
    public String getLeftBoxText() {
        return driver.findElement(boxA).getText();
    }
    public String getRightBoxText() {
        return driver.findElement(boxB).getText();
    }
}
