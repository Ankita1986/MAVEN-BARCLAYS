package uk.barclays.co.testsuite;

import org.testng.annotations.Test;
import uk.barclays.co.pages.HomePage;
import uk.barclays.co.testbase.TestBase;

/**
 * Created by Ankita
 */
public class RegisterTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToRegisterPage(){
        homePage.clickOnRegisterLink();
    }
}
