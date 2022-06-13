package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AbstractPage;

public class HomePage extends AbstractPage {
    private By SIGN = By.xpath("//*[@href='#icon-user-simple']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSign(){
        driver.findElement(SIGN).click();
    }
    public WebElement getSign() {return driver.findElement(SIGN);}
}
