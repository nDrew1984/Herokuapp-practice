import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage extends BasePage {
    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    private final By htmlBody = By.xpath("/html/body");

    public String getFrameText() {
        return driver.findElement(htmlBody).getText();
    }
}
