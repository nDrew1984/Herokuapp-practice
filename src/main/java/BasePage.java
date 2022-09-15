import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    private final String url = "http://the-internet.herokuapp.com/";
    private final By addRemoveElements = By.xpath("//*[@href=\"/add_remove_elements/\"]");
    private final By basicAuth = By.xpath("//*[@href=\"/basic_auth\"]");
    private final By brokenImages = By.xpath("//*[@href=\"/broken_images\"]");

    public void navigate() {
        driver.get(url);
    }
    public void clickAddRemoveElements() {
        driver.findElement(addRemoveElements).click();
    }
    public void clickBasicAuth() {
        driver.findElement(basicAuth).click();
    }
    public void clickBrokenImages() {
        driver.findElement(brokenImages).click();
    }
}
