import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesPage extends BasePage {

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    private final By nestedFrames = By.xpath("//*[@href=\"/nested_frames\"]");
    private final By iFrames = By.xpath("//*[@href=\"/iframe\"]");

    private final By file = By.xpath("(//*[@class=\"tox-mbtn__select-label\"])[1]");
    private final By edit = By.xpath("(//*[@class=\"tox-mbtn__select-label\"])[2]");
    private final By view = By.xpath("(//*[@class=\"tox-mbtn__select-label\"])[3]");
    private final By format = By.xpath("(//*[@class=\"tox-mbtn__select-label\"])[4]");
    private final By textArea = By.id("tinymce");

    public void clickNestedFrames() {
        driver.findElement(nestedFrames).click();
    }
    public void clickIFrames() {
        driver.findElement(iFrames).click();
    }
    public void clickFile() {
        driver.findElement(file).click();
    }
    public void clickEdit() {
        driver.findElement(edit).click();
    }
    public void clickView() {
        driver.findElement(view).click();
    }
    public void clickFormat() {
        driver.findElement(format).click();
    }

    public void writeText(String s) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(textArea));
        driver.findElement(textArea).clear();
        driver.findElement(textArea).sendKeys(s);
    }
}
