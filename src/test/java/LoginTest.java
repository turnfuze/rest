import driver.cash.WebDriverCash;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.base.HomeFlow;
import pages.base.HomePage;
import pages.login.pages.LoginFlow;
import pages.login.pages.LoginPopup;

public class LoginTest {
    private LoginFlow loginFlow;
    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPopup loginPopup;
    private HomeFlow homeFlow;

    @BeforeEach
    public void start() {
        webDriver = WebDriverCash.getDriver("chrome");
        loginFlow = new LoginFlow(webDriver);
        homePage = new HomePage(webDriver);
        loginPopup = new LoginPopup(webDriver);
        homeFlow = new HomeFlow(webDriver);
    }

    @Test
    public void loginError(){
        webDriver.get("https://rozetka.com.ua/");
        webDriver.manage().window().maximize();
        homeFlow.clickSign();
        loginFlow.enterLogin("Taynik");
        loginFlow.enterPassword("Sisam-Open");
        loginFlow.clickSubmit();
        Assertions.assertTrue(loginFlow.checkErrorAlert());
    }

    @Test
    public void signUp(){
        webDriver.get("https://rozetka.com.ua/");
        webDriver.manage().window().maximize();
        homeFlow.clickSign();
        loginFlow.clickSignUp();
        Assertions.assertTrue(loginFlow.checkSignUpBtn());
    }

    @AfterEach
    public void clear() {
        webDriver.quit();
    }
}
