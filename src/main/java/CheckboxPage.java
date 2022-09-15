import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxPage extends BasePage {
    public CheckboxPage(WebDriver driver) {
        super(driver);
    }

    private final By checkbox1 = By.xpath("//*[@type=\"checkbox\"][1]");
    private final By checkbox2 = By.xpath("//*[@type=\"checkbox\"][2]");

    /**********
     https://artoftesting.com/check-if-a-checkbox-is-checked-in-selenium-webdriver-java
    *********/
    public void clickCheckbox1() {
        driver.findElement(checkbox1).click();
    }
    public void clickCheckbox2() {
        driver.findElement(checkbox2).click();
    }
}
