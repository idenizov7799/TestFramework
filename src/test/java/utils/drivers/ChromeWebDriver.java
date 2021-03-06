package utils.drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author Ibraiym Denizov
 */
public class ChromeWebDriver
{
    protected static WebDriver LoadChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions",
                             "--allow-http-screen-capture",
                             "--ignore-certificate-errors",
                             "--start-maximized",
                             "window-size=1920,1080");
        return new ChromeDriver(options);
    }
}
