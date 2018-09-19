package com.fantesting.qaautomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class ContactPage {


    private WebDriver driver;


    public ContactPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int numberOfOffices() {
        List<WebElement> officeList = driver.findElements(By.xpath("//li[@class='office']"));
        return officeList.size();
    }


}
