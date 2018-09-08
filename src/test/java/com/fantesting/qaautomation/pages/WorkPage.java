package com.fantesting.qaautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkPage {

    @FindBy(xpath = "//header[@class='page-header']/h1")
    private WebElement pageHeader;

    private WebDriver driver;

    public WorkPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(pageHeader));
    }

    public String getHeaderText() {
        return pageHeader.getText();
    }
}