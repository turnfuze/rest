package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AbstractPage;

import java.time.Duration;
import java.util.List;

public class HomePage extends AbstractPage {
    private By sign = By.xpath("//*[@href='#icon-user-simple']");
    private By searchField = By.cssSelector(".search-form__input");
    private By searchResponse = By.cssSelector(".goods-tile__title");
    private By searchBtn = By.cssSelector(".search-form__submit");
    private By favorite = By.cssSelector(".wish-button");
    private By addToCart = By.cssSelector(".goods-tile__buy-button");
    private By addedToCart = By.cssSelector(".header__button--active span.ng-star-inserted");
    private By popup = By.cssSelector(".modal__holder_show_animation");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSign() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@href='#icon-user-simple']")));
        return driver.findElement(sign);
    }

    public WebElement getSearchInput() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".search-form__input")));
        return driver.findElement(searchField);
    }

    public List<WebElement> getSearchResponseTitle() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".goods-tile__title")));
        return driver.findElements(searchResponse);
    }

    public WebElement getSearchBtn() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".search-form__submit")));
        return driver.findElement(searchBtn);
    }

    public WebElement getFavoriteBtn() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".wish-button")));
        return driver.findElement(favorite);
    }

    public WebElement getAddToCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".goods-tile__buy-button")));
        return driver.findElement(addToCart);
    }

    public WebElement getAddedToCart() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".header__button--active span.ng-star-inserted")));
        return driver.findElement(addedToCart);
    }

    public WebElement getPopup() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".modal__holder_show_animation")));
        return driver.findElement(popup);
    }

}
