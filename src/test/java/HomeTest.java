import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;

public class HomeTest extends BaseTest{

    @Test
    public void renamePlaylist() throws InterruptedException {
        String updatedPlaylistSuccessMsg = "Updated playlist \"Test Playlist1.\"";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login();
        Thread.sleep(2000);
        homePage.doubleClickPlaylist();
        Thread.sleep(2000);
        homePage.enterNewName();
        Thread.sleep(2000);
        //assertion
        Assert.assertEquals(homePage.getRenamePlaylistSuccessMsg(), updatedPlaylistSuccessMsg);
    }

}