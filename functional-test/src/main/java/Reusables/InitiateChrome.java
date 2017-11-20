package Reusables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by cts2 on 4/6/2017.
 */
public class InitiateChrome {


    public WebDriver getDriver()
    {
        WebDriver driver = new ChromeDriver();
        return driver;
    }
}
