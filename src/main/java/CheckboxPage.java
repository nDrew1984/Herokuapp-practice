import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxPage extends BasePage {
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    private final By checkbox1 = By.xpath("//*[@type=\"checkbox\"][1]");
    private final By checkbox2 = By.xpath("//*[@type=\"checkbox\"][2]");
    private final By allCheckboxes = By.xpath("//*[@id=\"checkboxes\"]/input");

    public void clickCheckbox1() {
        driver.findElement(checkbox1).click();
    }
    public void clickCheckbox2() {
        driver.findElement(checkbox2).click();
    }
    public void clickAllCheckboxes() {
        List<WebElement> checkboxes = driver.findElements(allCheckboxes);
        for (WebElement check : checkboxes) {
            check.click();
        }
    }
    public void clickAllUnchecked() {
        List<WebElement> checkboxes = driver.findElements(allCheckboxes);
        for (WebElement check : checkboxes) {
            if (!check.isSelected()) {
                check.click();
            }
        }
    }
    public void clickAllChecked() {
        List<WebElement> checkboxes = driver.findElements(allCheckboxes);
        for (WebElement check : checkboxes) {
            if (check.isSelected()) {
                check.click();
            }
        }
    }
    public boolean isAllSelected() {
        List<WebElement> checkboxes = driver.findElements(allCheckboxes);
        for (WebElement check : checkboxes) {
            if (check.isSelected()) {
                return true;
            }
        } return false;
    }
}
