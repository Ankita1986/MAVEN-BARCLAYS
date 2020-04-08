package uk.barclays.co.pages;

import org.openqa.selenium.By;
import uk.barclays.co.utility.Utility;

/**
 * Created by Ankita
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log In");
    By registerLink = By.linkText("Register");
    By mortgageLink = By.linkText("Mortgage");

    public void clickOnLoginLink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }
    public void clickOnMortgageLink(){
        clickOnElement(mortgageLink);
    }
}
