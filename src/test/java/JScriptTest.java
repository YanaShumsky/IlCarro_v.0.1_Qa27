import org.testng.annotations.Test;

public class JScriptTest extends TestBase{

    @Test
    public void jsexecutorTest(){
        app.executor().typeTextInTextBox();
        app.executor().clickOnButton();
        app.executor().checkBox();
        app.executor().scrollPage();
        app.executor().novigateTo();
        app.executor().alertMy();
        app.executor().pause(10000);
    }
}
