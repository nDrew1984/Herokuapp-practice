import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FloatingMenuPage extends BasePage {
    public FloatingMenuPage(WebDriver driver) {
        super(driver);
    }

    private final By home = By.xpath("//*[@href=\"#home\"]");
    private final By news = By.xpath("//*[@href=\"#news\"]");
    private final By contact = By.xpath("//*[@href=\"#contact\"]");
    private final By about = By.xpath("//*[@href=\"#about\"]");
    private final By menuRow = By.xpath("//*[@id=\"menu\"]/ul/li");

    public void clickHome() {
        driver.findElement(home).click();
    }
    public void clickNews() {
        driver.findElement(news).click();
    }
    public void clickContact() {
        driver.findElement(contact).click();
    }
    public void clickAbout() {
        driver.findElement(about).click();
    }
    public Map<String, String> clickAllMenu() {
        List<WebElement> menuList = driver.findElements(menuRow);
        Map<String, String> namesLinks = new HashMap<>();
        for (WebElement menu : menuList) {
            menu.click();
            namesLinks.put(menu.getText(), driver.getCurrentUrl());
        } return namesLinks;
    }
}
