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
    protected final By multipleWindows = By.xpath("//*[@href=\"/windows\"]");
    protected final By contextMenu = By.xpath("//*[@href=\"/context_menu\"]");
    protected final By dynamicLoading = By.xpath("//*[@href=\"/dynamic_loading\"]");
    protected final By dynamicControls = By.xpath("//*[@href=\"/dynamic_controls\"]");
    protected final By entryAd = By.xpath("//*[@href=\"/entry_ad\"]");
    protected final By exitIntent = By.xpath("//*[@href=\"/exit_intent\"]");
    protected final By frames = By.xpath("//*[@href=\"/frames\"]");
    protected final By WYSIWYGEditor = By.xpath("//*[@href=\"/tinymce\"]");
    protected final By nestedFrames = By.xpath("//*[@href=\"/nested_frames\"]");
    protected final By typos = By.xpath("//*[@href=\"/typos\"]");

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
    public void clickMultipleWindows() {
        driver.findElement(multipleWindows).click();
    }
    public void clickContextMenu() {
        driver.findElement(contextMenu).click();
    }
    public void clickDynamicLoading() {
        driver.findElement(dynamicLoading).click();
    }
    public void clickDynamicControls() {
        driver.findElement(dynamicControls).click();
    }
    public void clickEntryAd() {
        driver.findElement(entryAd).click();
    }
    public void clickExitIntent() {
        driver.findElement(exitIntent).click();
    }
    public void clickFrames() {
        driver.findElement(frames).click();
    }
    public void clickWYSIWYGEditor() {
        driver.findElement(WYSIWYGEditor).click();
    }
    public void clickNestedFrame() {
        driver.findElement(nestedFrames).click();
    }
    public void clickTypos() {
        driver.findElement(typos).click();
    }


}
