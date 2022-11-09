package PageActions;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import PageObject.HomePage;
import PageObject.LoginPage;
import Utilities.MyWebDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class HomePageActions {

    private static WebDriver driver;
    public final static int TIMEOUT = 10;
    private MyWebDriver myWebDriver = new MyWebDriver();
    public final static HomePage homePage = new HomePage();

    public final static LoginPage loginPage = new LoginPage();

    @Before
    public void setUp() {
        driver = WebDriverManager.firefoxdriver().create();
        driver.manage().window().maximize();
    }

    @Given("User is on Login page {string}")
    public void loginTest(String url) throws InterruptedException {
        driver.get(url);
        driver.findElement(By.xpath(homePage.accept_terms_button_xpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(homePage.login_button_xpath));
    }


    @When("User open Login Site and enters username as {string} and password as {string}")
    public void goToLoginPageAndLogin(String userName, String passWord) throws Exception {

        driver.findElement(By.xpath(homePage.login_button_xpath)).click();
        Thread.sleep(2000);
        driver.findElement(By.id(loginPage.username_label_id)).sendKeys(userName);
        driver.findElement(By.name(loginPage.password_label_id)).sendKeys(passWord);
        driver.findElement(By.xpath(loginPage.login_button_xpath)).submit();
        Thread.sleep(2000);
    }

    @Then("User see error message {string} under password lable")
    public void verifyErrorMessage(String errorMessage) {
        String errorMessageOnSite = driver.findElement(By.xpath(loginPage.error_login_message_text_field_xpath)).getText();
        Assert.assertEquals(errorMessageOnSite,errorMessage);

    }

    @After
    public void teardown() {

        driver.quit();
    }

}

