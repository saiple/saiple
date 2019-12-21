import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginTest extends TestBase {

    @BeforeClass
    public static void before(){
        setUp("https://note-pad.net/", "C:\\Users\\razil\\Desktop\\text.txt");
    }

    @Test
    public void loginWithValidCredentials(){
        applicationManager.getLoginHelper().login();
        applicationManager.getLoginHelper().logout();
    }

    @Test
    public void loginWithInValidCredentials(){
        applicationManager.getLoginHelper().loginWithInvalidCredentials();
    }

    @AfterClass
    public static void close(){
        applicationManager.stop();
    }
}
