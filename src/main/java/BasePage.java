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
    protected final By dropdown = By.xpath("//*[@href=\"/dropdown\"]");
    protected final By floatingMenu = By.xpath("//*[@href=\"/floating_menu\"]");
    protected final By keyPresses = By.xpath("//*[@href=\"/key_presses\"]");
    protected final By hovers = By.xpath("//*[@href=\"/hovers\"]");
    protected final By dragAndDrop = By.xpath("//*[@href=\"/drag_and_drop\"]");
    protected final By javascriptAlerts = By.xpath("//*[@href=\"/javascript_alerts\"]");

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
    public void clickDropdown() {
        driver.findElement(dropdown).click();
    }
    public void clickFloatingMenu() {
        driver.findElement(floatingMenu).click();
    }
    public void clickKeyPresses() {
        driver.findElement(keyPresses).click();
    }
    public void clickHovers() {
        driver.findElement(hovers).click();
    }
    public void clickDragAndDrop() {
        driver.findElement(dragAndDrop).click();
    }
    public void clickJavascriptAlerts() {
        driver.findElement(javascriptAlerts).click();
    }
}
