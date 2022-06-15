import driver.cash.WebDriverCash;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.base.HomeFlow;
import pages.base.HomePage;

public class SearchTest {
    private WebDriver webDriver;
    private HomeFlow homeFlow;
    private HomePage homePage;

    @BeforeEach
    public void startProgram(){
        webDriver = WebDriverCash.getDriver("chrome");
        homeFlow = new HomeFlow(webDriver);
        homePage = new HomePage(webDriver);
    }

    @Test
    public void searchItem(){
        webDriver.get("https://rozetka.com.ua/");
        webDriver.manage().window().maximize();
        homeFlow.searchHPO();
        homeFlow.clickSearchBtn();
        Assertions.assertTrue(homeFlow.checkResultOfSearchK());
        Assertions.assertTrue(homeFlow.checkResultOfSearchO());
    }

    @Test
    public void addToFavorite(){
        webDriver.get("https://rozetka.com.ua/");
        webDriver.manage().window().maximize();
        homeFlow.searchHPO();
        homeFlow.clickSearchBtn();
        homeFlow.addToFavorite();
        Assertions.assertTrue(homeFlow.checkFavorite());
    }

    @Test
    public void addToCart(){
        webDriver.get("https://rozetka.com.ua/");
        webDriver.manage().window().maximize();
        homeFlow.searchHPO();
        homeFlow.clickSearchBtn();
        homeFlow.addToCart();
        Assertions.assertTrue(homeFlow.checkCart());
    }

    @AfterEach
    public void clear() {
        webDriver.quit();
    }
}