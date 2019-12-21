import entity.Credentials;
import entity.Sample;
import lombok.SneakyThrows;
import org.junit.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    static ApplicationManager applicationManager;


    public static void setUp(String url, String path) {
        applicationManager = ApplicationManager.getInstance();
        applicationManager.setUrl(url);
        applicationManager.setData(path);
        applicationManager.initializeHelpers();
    }
    //return applicationManager;

    public void stop() {
        applicationManager.stop();
    }

}
