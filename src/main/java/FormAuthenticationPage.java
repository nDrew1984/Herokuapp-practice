import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormAuthenticationPage extends BasePage {
    public FormAuthenticationPage(WebDriver driver) {
        super(driver);
    }

    private final By usernameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginButton = By.xpath("//*[@class=\"fa fa-2x fa-sign-in\"]");
    private final By welcomeMessage = By.xpath("//*[@class=\"example\"]/h4");
    private final By logoutButton = By.xpath("//*[@href=\"/logout\"]");
    private final By flashField = By.id("flash");

    public void enterUsername(String t) {
        driver.findElement(usernameField).sendKeys(t);
    }
    public void enterPassword(String t) {
        driver.findElement(passwordField).sendKeys(t);
    }
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    public String getMessage() {
        return driver.findElement(welcomeMessage).getText();
    }
    public void clickLogout() {
        driver.findElement(logoutButton).click();
    }
    public String getFlashText() {
        return driver.findElement(flashField).getText();
    }


}
