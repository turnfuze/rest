package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AbstractPage;

public class HomeFlow extends AbstractPage {
    private HomePage homePage;

    public HomeFlow(WebDriver driver) {
        super(driver);
        homePage = new HomePage(driver);
    }

    public void clickSign() {
        homePage.getSign().click();
    }

    public void searchHPO() {
        homePage.getSearchInput().click();
        homePage.getSearchInput().sendKeys("Кислота ортофосфорная");
    }

    public boolean checkResultOfSearchK() {
        boolean inSumm = true;
        for (WebElement title : homePage.getSearchResponseTitle()) {
            if (!title.getText().equalsIgnoreCase("Кислота")) {
                inSumm = false;
            }
        }
        return inSumm;
    }

    public boolean checkResultOfSearchO() {
        boolean inSumm = true;
        for (WebElement title : homePage.getSearchResponseTitle()) {
            if (!title.getText().equalsIgnoreCase("ортофосфорная")) {
                inSumm = false;
            }
        }
        return inSumm;
    }

    public void clickSearchBtn() {
        homePage.getSearchBtn().click();
    }

    public void addToFavorite() {
        homePage.getFavoriteBtn().click();
    }

    public void addToCart() {
        homePage.getAddToCart().click();
    }

    public boolean checkFavorite(){
        return homePage.getPopup().isDisplayed();
    }
    public boolean checkCart() {
        return homePage.getAddedToCart().getText().contains("1");
    }
}