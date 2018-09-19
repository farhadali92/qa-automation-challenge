package com.fantesting.qaautomation;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.fantesting.qaautomation.pages.HomePage;
import com.fantesting.qaautomation.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;

public abstract class BaseTest {

    public HomePage navigateToValtechWebsite() {
        WebDriver driver = WebDriverUtils.getWebDriver();
        driver.get("https://www.valtech.co.uk/");
        clickAcceptCookies(driver);
        return new HomePage(driver);
    }

    private void clickAcceptCookies(WebDriver driver) {
        WebElement acceptCookiesButton = driver.findElement(By.id("CybotCookiebotDialogBodyButtonAccept"));
        acceptCookiesButton.click();
    }

    @BeforeClass
    public static void setUp() {
        WebDriverUtils.initWebDriver();
    }

    @Before
    public void setUpBeforeEachTest() {
        WebDriverUtils.clearCookies();
    }

    @AfterClass
    public static void tearDown() {
        WebDriverUtils.quitWebDriver();
    }
}