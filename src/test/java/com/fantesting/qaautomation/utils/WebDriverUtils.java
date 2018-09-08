package com.fantesting.qaautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {

	private static WebDriver driver;

	public static void initWebDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void clearCookies() {
		driver.manage().deleteAllCookies();
	}

	public static WebDriver getWebDriver() {
		if (driver == null) {
			initWebDriver();
		}

		return driver;
	}

	public static void quitWebDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

}
