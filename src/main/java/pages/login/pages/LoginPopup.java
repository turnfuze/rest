package pages.login.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

import java.time.Duration;

public class LoginPopup extends AbstractPage {
    private By loginField = By.cssSelector("#auth_email");
    private By passwordField = By.cssSelector("#auth_pass");
    private By submit = By.cssSelector(".auth-modal__submit");
    private By errorAlert = By.cssSelector(".error-message");
    private By signUp = By.cssSelector(".auth-modal__register-link");
    private By checkSignUp = By.cssSelector(".modal__heading");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public LoginPopup(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginField() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#auth_email")));
        return driver.findElement(loginField);
    }

    public WebElement getPasswordField() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#auth_pass")));
        return driver.findElement(passwordField);
    }

    public WebElement getSubmit() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".auth-modal__submit")));
        return driver.findElement(submit);
    }

    public WebElement getErrorAlert() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".error-message")));
        return driver.findElement(errorAlert);
    }

    public WebElement getSignUp() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".auth-modal__register-link")));
        return driver.findElement(signUp);
    }

    public WebElement getCheckSignUp() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".modal__heading")));
        return driver.findElement(checkSignUp);
    }
}
