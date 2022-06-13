import driver.cash.WebDriverCash;
import lombok.SneakyThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.base.HomePage;
import pages.login.LoginFlow;
import pages.login.pages.LoginPopup;

public class MyTest {
    private LoginFlow loginFlow;
    private WebDriver webDriver;
    private HomePage homePage;
    private LoginPopup loginPopup;

    @BeforeEach
    public void start() {
        webDriver = WebDriverCash.getDriver("chrome");
        loginFlow = new LoginFlow(webDriver);
        homePage = new HomePage(webDriver);
        loginPopup = new LoginPopup(webDriver);
    }

    @Test
    public void login() throws InterruptedException {
        webDriver.get("https://rozetka.com.ua/");
        webDriver.manage().window().maximize();
        homePage.getSign().click();
        Thread.sleep(2000);
        loginFlow.enterLogin("Taynik");
        loginFlow.enterPassword("Sisam-Open");
        loginFlow.clickSubmit();
        loginPopup.getErrorAlert();
    }

    @SneakyThrows
    @AfterEach
    public void clear() {
        Thread.sleep(3000);
        webDriver.quit();
    }
}
