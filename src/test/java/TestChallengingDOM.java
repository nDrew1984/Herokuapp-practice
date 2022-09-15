import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestChallengingDOM extends BaseTest {

    @Test
    public void TestButtons() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickChallengingDOM();
        String expUrl = "https://the-internet.herokuapp.com/challenging_dom";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        ChallengingDOMPage challenge = new ChallengingDOMPage(driver);
        System.out.println("Blue text: " + challenge.blueButtonText());
        System.out.println("Red text: " + challenge.redButtonText());
        System.out.println("Green text: " + challenge.greenButtonText());

        String text = "bar";
        String[] arr = {challenge.blueButtonText(), challenge.redButtonText(), challenge.greenButtonText()};

        // checking if the "String text" is in the array of the buttons' text. If it's in there, then click on it:
        boolean act = challenge.contain(text, arr);
        Assertions.assertTrue(act);

        challenge.clickText(text);
    }

    @Test
    public void TestCanvas() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickChallengingDOM();
        String expUrl = "https://the-internet.herokuapp.com/challenging_dom";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        ChallengingDOMPage challenge = new ChallengingDOMPage(driver);
        System.out.println(challenge.canvasText());
    }
}
