import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDragAndDrop extends BaseTest {

    @Test
    public void TestDragDrop() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickDragAndDrop();

        String expUrl = "https://the-internet.herokuapp.com/drag_and_drop";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        DragAndDropPage drag = new DragAndDropPage(driver);
        drag.dragDrop();
    }
}
