import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends BasePage {
    public TyposPage(WebDriver driver) {
        super(driver);
    }

    private final By text = By.xpath("//*[@class=\"example\"]/p[2]");

    public String getSentence() {
        return driver.findElement(text).getText();
    }


}
