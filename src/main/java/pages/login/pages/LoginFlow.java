package pages.login.pages;

import org.openqa.selenium.WebDriver;
import pages.AbstractPage;

public class LoginFlow extends AbstractPage {
    private LoginPopup loginPopup;


    public LoginFlow(WebDriver driver) {
        super(driver);
        loginPopup = new LoginPopup(driver);
    }

    public void enterLogin(String login) {
        loginPopup.getLoginField().click();
        loginPopup.getLoginField().sendKeys(login);
    }

    public void enterPassword(String password) {
        loginPopup.getLoginField().click();
        loginPopup.getPasswordField().sendKeys(password);
    }

    public void clickSubmit() {
        loginPopup.getSubmit().click();
    }

    public boolean checkErrorAlert(){
        return loginPopup.getErrorAlert().isDisplayed();
    }

    public void clickSignUp(){loginPopup.getSignUp().click();}

    public boolean checkSignUpBtn(){return loginPopup.getCheckSignUp().isDisplayed();}
}
