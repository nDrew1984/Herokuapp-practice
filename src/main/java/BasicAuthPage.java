import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage extends BasePage {
    public BasicAuthPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "the-internet.herokuapp.com/basic_auth";
    private final By successMessage = By.xpath("//*[@class=\"example\"]/p");

    /*********************
     popup login syntax (without spaces):
     https: // username:password@URL
    **********************/

    public void login(String username, String password) {
        String popup = "https://" + username + ":" + password + "@" + url;
        driver.get(popup);
    }
    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
