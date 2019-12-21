package helpers;

import entity.Sample;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@AllArgsConstructor
public class CreateEntityHelper {

    private FirefoxDriver driver;

    private Sample sample;

    public CreateEntityHelper(FirefoxDriver driver) {
        this.driver = driver;
    }

    public void create(){
        createBySample(sample);
    }

    public void create(Sample sample){
        createBySample(sample);
    }

    @SneakyThrows
    private void createBySample(Sample sample){
        Thread.sleep(3000);

        WebElement create = driver.findElementByXPath("/html/body/div[1]/div/div/div[2]/div[2]/div[2]/a/div");
        create.click();

        Thread.sleep(3000);

        WebElement title = driver.findElementByXPath("//*[@id=\"page_title\"]");
        title.sendKeys(sample.getSampleCreateText());

        Thread.sleep(3000);

        WebElement createPage = driver.findElementByXPath("/html/body/div[1]/div/div[1]/div[1]/a[3]");
        createPage.click();

        Thread.sleep(3000);

        WebElement title1 = driver.findElementByXPath("//*[@id=\"page_title\"]");
        title1.sendKeys(sample.getSampleCreateText());

        Thread.sleep(3000);
    }
}
