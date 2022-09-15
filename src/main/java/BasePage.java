import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected final String url = "https://the-internet.herokuapp.com/";
    protected final By addRemoveElements = By.xpath("//*[@href=\"/add_remove_elements/\"]");
    protected final By basicAuth = By.xpath("//*[@href=\"/basic_auth\"]");
    protected final By brokenImages = By.xpath("//*[@href=\"/broken_images\"]");
    protected final By challengingDOM = By.xpath("//*[@href=\"/challenging_dom\"]");
    protected final By formAuthentication = By.xpath("//*[@href=\"/login\"]");
    protected final By checkboxes = By.xpath("//*[@href=\"/checkboxes\"]");

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
    public void clickChallengingDOM() {
        driver.findElement(challengingDOM).click();
    }
    public void clickFormAuthentication() {
        driver.findElement(formAuthentication).click();
    }
    public void clickCheckboxes() {
        driver.findElement(checkboxes).click();
    }
}
