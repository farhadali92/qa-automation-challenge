package com.fantesting.qaautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class AboutPage {

    @FindBy(xpath = ".//div[@class='page-header']/h1")
    private WebElement pageHeader;

    @FindBy(xpath = "//a[@href ='/about/contact-us/']")
    private WebElement ourOfficesLink;


    private WebDriver driver;

    public AboutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    public String getHeaderText() {
        return pageHeader.getText();
    }

    public ContactPage  navigateToContactPage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(ourOfficesLink).click().build().perform();
        return new ContactPage(driver);
    }
}
