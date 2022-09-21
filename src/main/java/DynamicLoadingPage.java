import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage extends BasePage {
    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    // Explicit wait conditions:
    // https://www.selenium.dev/selenium/docs/api/py/webdriver_support/selenium.webdriver.support.expected_conditions.html
    // https://seleniumjava.com/2016/04/05/the-beginners-guide-to-explicit-waits/
    private final By example1 = By.xpath("//*[@href=\"/dynamic_loading/1\"]");
    private final By example2 = By.xpath("//*[@href=\"/dynamic_loading/2\"]");
    private final By startButton = By.xpath("//*[@id=\"start\"]/button");
    private final By textResult = By.xpath("//*[@id=\"finish\"]/h4");

    public void clickExample1() {
        driver.findElement(example1).click();
    }
    public void clickExample2() {
        driver.findElement(example2).click();
    }
    public void clickStart() {
        driver.findElement(startButton).click();
    }
    public String getTextResult() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(textResult))
                .getText();
        return text;
    }
}
