package com.fantesting.qaautomation;

import com.fantesting.qaautomation.pages.AboutPage;
import com.fantesting.qaautomation.pages.ContactPage;
import com.fantesting.qaautomation.pages.HomePage;
import org.junit.Assert;
import org.junit.Test;

public class ContactPageTest extends BaseTest {

    @Test
    public void testNumberOfOfficesAreCorrect() {
        HomePage homePage = navigateToValtechWebsite();
        AboutPage aboutPage = homePage.navigateToAbout();
        ContactPage contactPage = aboutPage.navigateToContactPage();
        int officeCount = contactPage.numberOfOffices();
        Assert.assertEquals(officeCount, 37);


    }
}
