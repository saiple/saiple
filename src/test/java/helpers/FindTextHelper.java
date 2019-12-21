package helpers;

import entity.Sample;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@AllArgsConstructor
public class FindTextHelper {

    FirefoxDriver driver;

    Sample sample;

    public FindTextHelper(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void find(){
        findBySample(sample);
    }

    public void find(Sample sample){
        findBySample(sample);
    }

    @SneakyThrows
    private void findBySample(Sample sample){
        Thread.sleep(3000);

        WebElement findButton = driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div[3]/div/a");
        findButton.click();

        Thread.sleep(3000);

        WebElement keys = driver.findElementByXPath("/html/body/div[1]/div/div[2]/form/input[1]");
        keys.sendKeys(sample.getSampleFindText());

        Thread.sleep(3000);

        keys.submit();

        Thread.sleep(3000);

    }

}
