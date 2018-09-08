package com.fantesting.qaautomation;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import com.fantesting.qaautomation.pages.HomePage;
import com.fantesting.qaautomation.utils.WebDriverUtils;

public abstract class BaseTest {

    public HomePage navigateToValtechWebsite() {
        WebDriver driver = WebDriverUtils.getWebDriver();
        driver.get("https://www.valtech.co.uk/");
        return new HomePage(driver);
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