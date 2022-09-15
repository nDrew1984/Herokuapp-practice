import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage extends BasePage {
    public AddRemovePage(WebDriver driver) {
        super(driver);
    }

    private final By addElementButton = By.xpath("//*[@class=\"example\"]/button");
    private final By removeButtons = By.xpath("//*[@id=\"elements\"]/button");

    public void clickAddElement(int t) {
        for (int i = 0; i < t; i++) {
            driver.findElement(addElementButton).click();
        }
    }
    public void clickNthRemove(int n) {
        List<WebElement> removes = driver.findElements(removeButtons);
        removes.get(n).click();
    }
    public int numberOfRemoves() {
        List<WebElement> removes = driver.findElements(removeButtons);
        return removes.size();
    }
}
