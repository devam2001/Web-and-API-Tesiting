package org.last.fm;

import com.browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class FakeLoginTest {

        WebDriver driver;
        FakeLogin fakeLogin;

        @BeforeTest
        public void setup() {
                driver = BrowserFactory.setupBrowser("chrome", "https://www.last.fm/");
                fakeLogin = new FakeLogin(driver);
        }
        ResourceBundle bundle = ResourceBundle.getBundle("config");

        @Test(priority = 1)
        public void loginVerification() throws InterruptedException {

                String fake_username = bundle.getString("usernameFake");
                String fake_password = bundle.getString("passwordFake");
                TimeUnit.SECONDS.sleep(6);
                fakeLogin.MainLoginButton();
                TimeUnit.SECONDS.sleep(4);
                fakeLogin.enterUsername(fake_username);
                fakeLogin.enterPassword(fake_password);
                fakeLogin.LetMeInButton();
                TimeUnit.SECONDS.sleep(4);

        }
}