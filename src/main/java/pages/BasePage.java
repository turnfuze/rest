package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage extends AbstractPage{
   private static final By SIGNIN = By.cssSelector(".header-actions__component .ng-star-inserted");

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignInbtn(){
        return driver.findElement(SIGNIN);
    }
}
