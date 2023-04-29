package org.last.fm;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class EditDetailsOfPlayistTest {
    WebDriver driver;

    @Test(priority = 5)
    public void editdetailsofplaylist() throws InterruptedException {
        EditDetailsOfPlayList ob = new EditDetailsOfPlayList(driver);

        Thread.sleep(4000);
        ob.setPlayListName();
        Thread.sleep(2000);
        ob.clickOuterBdy();
        Thread.sleep(2000);
    }
}
