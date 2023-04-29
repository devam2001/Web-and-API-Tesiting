package org.last.fm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AddTrackinPlaylistTest {
    WebDriver driver;

    @Test(priority = 6)
    public void addtracktoplaylist() throws InterruptedException {

        AddTrackInPlaylist addT = new AddTrackInPlaylist(driver);

        Thread.sleep(4000);

        addT.setAddTrack();
        addT.setSearchBox();
        addT.AddFunc();
        Thread.sleep(3000);
        addT.setAddSimilarTracks();
        Thread.sleep(5000);

    }
}
