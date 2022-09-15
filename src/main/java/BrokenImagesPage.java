import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BrokenImagesPage extends BasePage {
    public BrokenImagesPage(WebDriver driver) {
        super(driver);
    }

    private final By images = By.xpath("//*[@class=\"example\"]/img");

    public int numberOfImages() {
        List<WebElement> list = driver.findElements(images);
        return list.size();
    }

    public int numberOfBroken() {
        List<WebElement> imageList = driver.findElements(images);
        int brokenImages = 0;
        for (WebElement img : imageList) {
            if (img.getAttribute("naturalWidth").equals("0")) {
                brokenImages++;
            }
        } return brokenImages;
    }
}
