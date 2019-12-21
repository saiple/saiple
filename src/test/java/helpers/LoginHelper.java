package helpers;

import entity.Credentials;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@AllArgsConstructor
public class LoginHelper {

    FirefoxDriver driver;

    Credentials credentials;

    Credentials invalidCredentials;

    public LoginHelper(FirefoxDriver driver, Credentials credentials, Credentials invalidCredentials) {
        this.driver = driver;
        this.credentials = credentials;
        this.invalidCredentials = invalidCredentials;
    }

    private boolean isLoggedIn = false;

    public LoginHelper(FirefoxDriver driver) {
        this.driver = driver;
    }

    @SneakyThrows
    public void logout(){
        if (!isLoggedIn)
            return;
        WebElement logout = driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div[3]/div/span/a");
        logout.click();
        isLoggedIn = false;
    }

    public void login(){
        loginByCredentials(credentials);
    }

    public void login(Credentials credentials){
        loginByCredentials(credentials);
    }

    @SneakyThrows
    private void loginByCredentials(Credentials credentials){
        if(isLoggedIn)
            return;

        Thread.sleep(3000);

        WebElement login = driver.findElementByXPath("//*[@id=\"email\"]");
        login.sendKeys(credentials.getLogin());

        WebElement password = driver.findElementByXPath("//*[@id=\"password\"]");
        password.sendKeys(credentials.getPassword());

        Thread.sleep(3000);

        password.submit();
        Thread.sleep(3000);

        isLoggedIn = true;
    }

    public String getUsername() {
        return driver.findElementByXPath("/html/body/div[1]/div/div/div[1]/div[3]/div/div/div[1]/span/span").getText();
    }

    public void loginWithInvalidCredentials(){
        loginByCredentials(invalidCredentials);
        isLoggedIn = false;
    }

}
