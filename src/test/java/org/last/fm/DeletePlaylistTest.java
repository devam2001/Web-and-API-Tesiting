package org.last.fm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DeletePlaylistTest {
    WebDriver driver;

    @Test(priority = 8)
    public void deleteplaylist() throws InterruptedException {
        DeletePlaylist del = new DeletePlaylist(driver);

        del.setDropDownPlaylist();
        Thread.sleep(3000);
        del.setDelPlaylist();
        Thread.sleep(2000);
        del.setDelBttn2();

    }
    @AfterClass
    void tearDown () {
        driver.quit();
    }
}
