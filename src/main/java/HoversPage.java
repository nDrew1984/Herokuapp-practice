import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    private final By img1 = By.xpath("//*[@class=\"figure\"][1]");
    private final By img2 = By.xpath("//*[@class=\"figure\"][2]");
    private final By img3 = By.xpath("//*[@class=\"figure\"][3]");

    private final By images = By.xpath("//*[@class=\"figure\"]");
    private final String baseLink = "//*[@href='/users/";
    // private final By profileLinks = By.xpath(".//a");
    // -> not working relative xpath. I used "baseLink" variable instead.
    // private final By users = By.xpath("(//*[@class=\"figure\"]/div/h5)");
    private final String users = "(//*[@class=\"figure\"]/div/h5)";

    private final By user1Profile = By.xpath("//*[@href=\"/users/1\"]");
    private final By user2Profile = By.xpath("//*[@href=\"/users/2\"]");
    private final By user3Profile = By.xpath("//*[@href=\"/users/3\"]");

    public void clickUser1Profile() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(img1))
                .click(driver.findElement(user1Profile))
                .build()
                .perform();
    }

    public void clickAllProfiles() {
        List<WebElement> pictures = driver.findElements(images);
        Actions actions = new Actions(driver);
        int i = 1;
        for (WebElement pic : pictures) {
            actions.moveToElement(pic)
                    .click(driver.findElement(By.xpath(baseLink + i + "']")))
                    .build()
                    .perform();
            driver.navigate().back();
            i++;
        }
    }
    public List<String> getUserList() {
        List<String> usersNames = new ArrayList<>();
        List<WebElement> pictures = driver.findElements(images);
        int i = 1;
        for (WebElement pic : pictures) {
            Actions actions = new Actions(driver);
            actions.moveToElement(pic)
                    .build()
                    .perform();
            usersNames.add(driver.findElement(By.xpath(users + "[" + i + "]"))
                    .getText()
                    .replace("name: ", ""));
            i++;
        }
        return usersNames;
    }
    public List<String> getUserLinks() {
        List<String> userLinks = new ArrayList<>();
        List<WebElement> pictures = driver.findElements(images);
        Actions actions = new Actions(driver);
        int i = 1;
        for (WebElement pic : pictures) {
            actions.moveToElement(pic)
                    .click(driver.findElement(By.xpath(baseLink + i + "']")))
                    .build()
                    .perform();
            userLinks.add(driver.getCurrentUrl());
            driver.navigate().back();
            i++;
        }
        return userLinks;
    }


}
