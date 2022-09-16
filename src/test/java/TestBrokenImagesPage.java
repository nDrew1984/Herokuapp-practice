import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBrokenImagesPage extends BaseTest {

    @Test
    public void TestBrokenImages() {
        BrokenImagesPage broken = new BrokenImagesPage(driver);
        broken.navigate();
        broken.clickBrokenImages();

        String expUrl = "https://the-internet.herokuapp.com/broken_images";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        String exp = "Number of broken images: " + 0;
        String act = "Number of broken images: " + broken.numberOfBroken();

        Assertions.assertEquals(exp, act);





    }
}
