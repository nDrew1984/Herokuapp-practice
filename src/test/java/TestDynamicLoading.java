import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDynamicLoading extends BaseTest {

    @Test
    public void TestDynamicEx1() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickDynamicLoading();

        String expUrl = "https://the-internet.herokuapp.com/dynamic_loading";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        DynamicLoadingPage dynamic = new DynamicLoadingPage(driver);
        dynamic.clickExample1();
        dynamic.clickStart();

        String exp = "Hello World!";
        String act = dynamic.getTextResult();
        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestDynamicEx2() {
        BasePage base = new BasePage(driver);
        base.navigate();
        base.clickDynamicLoading();

        String expUrl = "https://the-internet.herokuapp.com/dynamic_loading";
        String actUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expUrl, actUrl);

        DynamicLoadingPage dynamic = new DynamicLoadingPage(driver);
        dynamic.clickExample2();
        dynamic.clickStart();

        String exp = "Hello World!";
        String act = dynamic.getTextResult();
        Assertions.assertEquals(exp, act);
    }
}
