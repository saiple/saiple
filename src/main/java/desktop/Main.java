package desktop;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\razil\\Desktop\\Git\\SelenumDemo\\src\\main\\resources\\Winium.Desktop.Driver.exe");
        ProcessBuilder pro = new ProcessBuilder("C:\\Users\\razil\\Desktop\\Git\\SelenumDemo\\SelenumDemo\\src\\main\\resources\\Winium.Desktop.Driver.exe");
        Process shell = pro.start();

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("app","C:\\Program Files\\PuTTY\\PuTTY.exe"); //если хотим сразу запускать какую-либо программу
        cap.setCapability("launchDelay","5"); //задержка после запуска программы
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:9999"),cap);
        String ip = "192.168.202.200";
        WebElement wrk = driver.findElement(By.name("Имя хоста (или IP-адрес)"));
        wrk.sendKeys(ip);
        wrk.submit();
        Thread.sleep(500);
        wrk = driver.findElement(By.name(ip + " - PuTTY"));
        wrk.sendKeys("saiple");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("saiple");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("ls -a");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("ip add");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("whoami");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("groups");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("ls -R /usr");
        wrk.submit();
        Thread.sleep(4500);
        wrk.sendKeys("ps aux");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("echo \"Testing is cool\"");
        wrk.submit();
        Thread.sleep(500);
        wrk.sendKeys("exit");
        wrk.submit();



        shell.destroy();



    }
}
