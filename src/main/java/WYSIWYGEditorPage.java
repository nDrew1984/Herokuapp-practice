import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WYSIWYGEditorPage extends BasePage {
    public WYSIWYGEditorPage(WebDriver driver) {
        super(driver);
    }

    private final By file = By.xpath("//*[@role=\"menubar\"]/button[1]");
    private final By edit = By.xpath("//*[@role=\"menubar\"]/button[2]");
    private final By sixthElem = By.xpath("(//*[@class=\"tox-collection__item-label\"])[6]");
    private final By view = By.xpath("//*[@role=\"menubar\"]/button[3]");
    private final By format = By.xpath("//*[@role=\"menubar\"]/button[4]");
    private final By firstElem = By.xpath("(//*[@class=\"tox-collection__item-label\"])[1]");
    private final By textArea = By.id("tinymce");

    public void selectFile(String s) {
        Select select = new Select(driver.findElement(file));
        select.selectByVisibleText(s);
    }
    public void selectAll() {
        driver.findElement(edit).click();
        driver.findElement(sixthElem).click();
    }
    public void selectView(String s) {
        Select select = new Select(driver.findElement(view));
        select.selectByVisibleText(s);
    }
    public void selectBold() {
        driver.findElement(format).click();
        driver.findElement(firstElem).click();
    }
    public void writeText(String s) {
        driver.findElement(textArea).clear();
        driver.findElement(textArea).sendKeys(s);
    }
}
