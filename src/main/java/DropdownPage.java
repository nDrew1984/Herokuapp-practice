import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {
    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    private final By dropdown = By.id("dropdown");

    public void selectOption(String option) {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(option);
    }
    public String getSelected() {
        Select select = new Select(driver.findElement(dropdown));
        return select.getFirstSelectedOption().getText();
    }
}
