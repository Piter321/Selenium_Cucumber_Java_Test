package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;


public class MyWebDriver{

    public void waitUntilElementIsClickAble(WebDriver driver, WebElement webElement, int timeOut) throws Exception {
        Instant now = Instant.now();
        while (Instant.now().isBefore(now.plusSeconds(timeOut)))
        {
            try
            {
                new WebDriverWait(driver, Duration.ofSeconds(timeOut)).until(ExpectedConditions.elementToBeClickable(webElement)).click();

                return;
            }
            catch (WebDriverException e)
            {
                // do nothing, loop again
            }
        }

        throw new Exception("Not able to click element <" + webElement + "> within " + timeOut + "s.");
    }

}
