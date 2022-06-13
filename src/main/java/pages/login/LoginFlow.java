package pages.login;

import org.openqa.selenium.WebDriver;
import pages.AbstractPage;
import pages.login.pages.LoginPopup;

public class LoginFlow extends AbstractPage {
    private LoginPopup loginPopup = new LoginPopup(driver);


    public LoginFlow(WebDriver driver) {
        super(driver);
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
}
