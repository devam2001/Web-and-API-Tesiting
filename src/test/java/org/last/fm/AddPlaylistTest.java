package org.last.fm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddPlaylistTest {
    WebDriver driver;
    @Test(priority = 4)
    public void addplaylist() throws InterruptedException {
        AddPlaylist add = new AddPlaylist(driver);

        Thread.sleep(2000);

        add.PlaylistNavFunc();
        Thread.sleep(3000);

        add.newPlaylistBttnFunc();
        Thread.sleep(3000);

        add.startFrmScratchFunc();

        Thread.sleep(4000);

    }
}
