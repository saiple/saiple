package helpers;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@AllArgsConstructor
public class BackHelper {

    FirefoxDriver driver;

    @SneakyThrows
    public void backFromFind(){
        WebElement back = driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[1]/a");
        back.click();

        Thread.sleep(3000);
    }

    @SneakyThrows
    public void backFromCreate(){
        WebElement back = driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[1]/a[1]");
        back.click();

        Thread.sleep(3000);
    }

    @SneakyThrows
    public void backFromPda(){
        WebElement element = driver.findElementByXPath("/html/body/div[2]/div[1]/a");
        element.click();
        Thread.sleep(3000);
    }


}
