import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class AuthBase extends TestBase {

    @BeforeClass
    public static void before(){
        setUp("https://note-pad.net/", "C:\\Users\\razil\\Desktop\\text.txt");
        applicationManager.getLoginHelper().login();
    }

    @AfterClass
    public static void after(){
        applicationManager.getLoginHelper().logout();
        applicationManager.stop();
    }

}
