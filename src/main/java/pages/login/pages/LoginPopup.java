package pages.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AbstractPage;

public class LoginPopup extends AbstractPage {
    private By loginField = By.cssSelector("#auth_email");
    private By passwordField = By.cssSelector("#auth_pass");
    private By submit = By.cssSelector(".auth-modal__submit");
    private By errorAlert = By.cssSelector(".error-message");

    public LoginPopup(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginField() {
        return driver.findElement(loginField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(loginField);
    }

    public WebElement getSubmit(){
        return driver.findElement(submit);
    }

    public WebElement getErrorAlert(){
        return driver.findElement(errorAlert);
    }
}
