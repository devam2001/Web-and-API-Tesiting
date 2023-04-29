package org.last.fm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RemoveSongFromPlaylistTest {
    WebDriver driver;

    @Test(priority = 7)
    public void removesongfromplaylist() throws InterruptedException {
        RemoveSongFromPlaylist Rm = new RemoveSongFromPlaylist(driver);

        Thread.sleep(4000);
        Rm.setElement();
        Thread.sleep(2000);
        Rm.setMoreBttn();
        Thread.sleep(2000);
        Rm.setRmvBttn();

    }
}
