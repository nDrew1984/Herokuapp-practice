import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPAge extends BasePage {
    public EntryAdPAge(WebDriver driver) {
        super(driver);
    }

    private final By clickHere = By.id("restart-ad");
    private final By closeModalButton = By.xpath("//*[@class=\"modal-footer\"]/p");

    public void clickClickHere() {
        driver.findElement(clickHere).click();
    }
    public void clickCloseModal() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeModalButton)).click();
    }
    public boolean isModalDisplayed() {
        return driver.findElement(closeModalButton).isDisplayed();
    }
}
