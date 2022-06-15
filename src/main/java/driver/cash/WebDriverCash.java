package driver.cash;

import driver.WebDriverUtils;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class WebDriverCash {
    private static Map<String, WebDriver> webDriver = new HashMap<>();

    private WebDriverCash(){}

        public static WebDriver getDriver(String name){
        if(webDriver.get(name) == null){
            webDriver.put(name, WebDriverUtils.getDriver(name));
        }
        return webDriver.get(name);
    }
}
