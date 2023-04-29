package org.last.fm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginCheckTest {
    WebDriver driver;
    @Test(priority = 3)
    public void logincheck() throws InterruptedException {
        LoginCheck login = new LoginCheck(driver);

        Thread.sleep(2000);
        login.MainUsername();
        Thread.sleep(4000);

    }
}
