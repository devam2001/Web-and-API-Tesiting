package org.last.fm;

import com.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;
    Login login;
    ResourceBundle bundle = ResourceBundle.getBundle("config");

    @BeforeTest
    public void setup() {
        driver = BrowserFactory.setupBrowser("chrome", "https://www.last.fm/");
        login = new Login(driver);
    }

    @Test(priority = 2)
    public void loginVerification() throws InterruptedException {
        String username = bundle.getString("username");
        String password = bundle.getString("password");
        TimeUnit.SECONDS.sleep(6);
        login.clickMainLoginButton();
        TimeUnit.SECONDS.sleep(4);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLetMeInButton();
    }
}