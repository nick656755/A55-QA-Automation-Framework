import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.WebElement;

public class Homework22 extends BaseTest{

    @Test
    public void renamePlaylist() {

        String updatedNameMsg = "Updated playlist \"Test Playlist1.\"";
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        // step1: login to koel
        loginPage.login();
        //step2: double click on playlist
        homePage.doubleClickPlaylist();
        //step3: rename a playlist
        homePage.addNewNameToPlaylist();
        //step4: check if we rename the playlist

        Assert.assertEquals(homePage.playlistMsg(), updatedNameMsg);

    }
}
