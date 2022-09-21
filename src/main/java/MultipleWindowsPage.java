import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

// https://www.guru99.com/alert-popup-handling-selenium.html
public class MultipleWindowsPage extends BasePage {
    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    private final By clickHere = By.xpath("//*[@href=\"/windows/new\"]");
    private final By newWindowText = By.xpath("//*[@class=\"example\"]/h3");

    public void clickClickHere() {
        driver.findElement(clickHere).click();
    }
    public String getNewWindowText() {
        String mainWindow = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        while (i1.hasNext()) {
            String newWindow = i1.next();
            if (!mainWindow.equalsIgnoreCase(newWindow)) {
                driver.switchTo().window(newWindow);
            }
        }
        return driver.findElement(newWindowText).getText();

    }
}
