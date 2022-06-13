import driver.cash.WebDriverCash;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.base.HomePage;
import pages.login.LoginFlow;

public class TestLogin {
    WebDriver webDriver = WebDriverCash.getDriver("chrome");
    BasePage basePage = new BasePage(webDriver);
    HomePage homePage = new HomePage(webDriver);
    LoginFlow loginFlow = new LoginFlow(webDriver);

    @Test
    public void clickSign(){

        webDriver.get("https://rozetka.com.ua/");
        homePage.clickSign();
        webDriver.switchTo().frame(1);
        basePage.getSignInbtn().click();
        loginFlow.enterLogin("Taynik");
        loginFlow.enterPassword("Sisam-Open");
        loginFlow.clickSubmit();


    }

}
