import com.fasterxml.jackson.databind.ObjectMapper;
import entity.ReceivedData;
import helpers.*;
import lombok.Data;
import lombok.SneakyThrows;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

@Data
public class ApplicationManager {

    private BackHelper backHelper;
    private CreateEntityHelper createEntityHelper;
    private FindTextHelper findTextHelper;
    private LoginHelper loginHelper;
    private OpenPdaVersionHelper openPdaVersionHelper;
    private FirefoxDriver driver;
    private ReceivedData receivedData;

    static ThreadLocal<ApplicationManager> threadLocal = new ThreadLocal<ApplicationManager>();

    private ApplicationManager(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\razil\\Desktop\\Git\\SelenumDemo\\src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
    }

    public void initializeHelpers(){
        openPdaVersionHelper = new OpenPdaVersionHelper(driver);
        backHelper = new BackHelper(driver);
        createEntityHelper = new CreateEntityHelper(driver, receivedData.getSample());
        findTextHelper = new FindTextHelper(driver, receivedData.getSample());
        loginHelper = new LoginHelper(driver, receivedData.getValidCredentials(), receivedData.getInValidCredentials());
    }

    public void stop(){
        driver.quit();
    }

    public static ApplicationManager getInstance() {
        if (threadLocal.get() == null)
            threadLocal.set(new ApplicationManager());
        return threadLocal.get();
    }

    public void setUrl(String url){
        driver.get(url);
    }

    @SneakyThrows
    public void setData(String path){
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        String st;
        StringBuilder builder = new StringBuilder();
        while ((st = br.readLine()) != null)
            builder.append(st);
        ObjectMapper objectMapper = new ObjectMapper();
        receivedData = objectMapper.readValue(builder.toString(), ReceivedData.class);
    }
}

