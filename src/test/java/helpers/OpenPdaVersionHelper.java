package helpers;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@AllArgsConstructor
public class OpenPdaVersionHelper {

    FirefoxDriver driver;

    @SneakyThrows
    public void openPda(){
        WebElement element = driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div[3]/a[4]");
        element.click();
        Thread.sleep(3000);
    }
}
