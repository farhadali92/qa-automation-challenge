package com.fantesting.qaautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//h2[text()='recent blogs']")
	private WebElement recentBlogHeader;

	@FindBy(xpath = "//a[@href='/about/']")
	private WebElement aboutLink;

	@FindBy(xpath = "//a[@href='/services/']")
	private WebElement servicesLink;

	@FindBy(xpath = "//a[@href='/work/']")
	private WebElement workLink;


	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean isRecentBlogSectionDisplayed() {
		return recentBlogHeader.isDisplayed();		
	}

	public AboutPage navigateToAbout() {
		aboutLink.click();
		return new AboutPage(driver);
	}

	public ServicesPage navigateToServices() {
		servicesLink.click();
		return new ServicesPage(driver);
	}

	public WorkPage navigateToWork() {
		workLink.click();
		return new WorkPage(driver);
	}

}
