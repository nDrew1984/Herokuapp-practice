import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChallengingDOMPage extends BasePage {
    public ChallengingDOMPage(WebDriver driver) {
        super(driver);
    }

    private final By buttons = By.xpath("//*[@class=\"large-2 columns\"]/a");
    private final By blueButton = By.className("button");
    private final By redButton = By.cssSelector(".button.alert");
    private final By greenButton = By.cssSelector(".button.success");
    private final By canvasField = By.id("canvas");

    public void clickText(String buttonText) {
        List<WebElement> buttonList = driver.findElements(buttons);
        for (WebElement button : buttonList) {
            String text = button.getText();
            if (text.equals(buttonText)) {
                button.click();
                break;
            }
        }
    }
    public boolean contain(String searchedText, String[] arr) {
        boolean found = false;
        for (String t : arr) {
            if (t.equals(searchedText)) {
                found = true;
                break;
            }
        } return found;
    }
    public void clickBlueButton() {
        driver.findElement(blueButton).click();
    }
    public void clickRedButton() {
        driver.findElement(redButton).click();
    }
    public void clickGreenButton() {
        driver.findElement(greenButton).click();
    }
    public String blueButtonText() {
        return driver.findElement(blueButton).getText();
    }
    public String redButtonText() {
        return driver.findElement(redButton).getText();
    }
    public String greenButtonText() {
        return driver.findElement(greenButton).getText();
    }
    public String canvasText() {
        return driver.findElement(canvasField).getText();
    }

}
