package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MyWebDriver{
    public static int implicitly_wait = 30;
    private static WebDriver myDriver;
//    private static DesiredCapabilities desired = new DesiredCapabilities();
//
//    public static WebDriver getMyWebDriver(String browserName){
//        if(myDriver != null){
//            return myDriver;
//        }
//
//        switch (browserName.toLowerCase()){
//            case "firefox":
//                FirefoxProfile profile = new FirefoxProfile();
//                profile.setPreference("network.proxy.no_proxies_on", "localhost");
//                profile.setPreference("javascript.enabled", true);
//                FirefoxOptions firefoxOptions = new FirefoxOptions();
//                firefoxOptions.addArguments("--headless");
//                WebDriverManager.firefoxdriver().create();
//                myDriver = new FirefoxDriver();
//
//            case "chrome":
//                WebDriverManager.chromiumdriver().getWebDriver();
//                myDriver = new ChromeDriver();
//
//            default:
//                WebDriverManager.edgedriver().getWebDriver();
//                myDriver = new EdgeDriver();
//        }
//
//        return myDriver;
//    }
}
