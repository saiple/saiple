import entity.Credentials;
import entity.Sample;

public class SiteTest extends TestBase {

    protected String url = "https://note-pad.net/";

    protected Credentials credentials = new Credentials("razil0071999@gmail.com", "password1");

    protected Sample sample = new Sample("бла бла бла бла", "бла");

//    @SneakyThrows
//    @Test
//    void findText(){
//        FirefoxDriver driver = init(url);
//        login(driver, inValidCredentials);
//        findText(sample, driver);
//        logout(driver);
//    }
//
//
//    @SneakyThrows
//    @Test
//    void createPage(){
//        FirefoxDriver driver = init(url);
//        login(driver, inValidCredentials);
//        createPage(sample, driver);
//        logout(driver);
//    }


}
