package com.fantesting.qaautomation;

import com.fantesting.qaautomation.pages.AboutPage;
import com.fantesting.qaautomation.pages.HomePage;
import com.fantesting.qaautomation.pages.ServicesPage;
import com.fantesting.qaautomation.pages.WorkPage;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class PageNavigationTest extends BaseTest {
	
	@Test
	public void testThatNavigationToAboutPageWorks() {
		HomePage homePage = navigateToValtechWebsite();
		AboutPage aboutPage = homePage.navigateToAbout();
		String headerText = aboutPage.getHeaderText();
		assertThat(headerText, equalTo("About"));
	}

	@Test
	public void testThatNavigationToServicesPageWorks() {
		HomePage homePage = navigateToValtechWebsite();
		ServicesPage servicesPage = homePage.navigateToServices();
		String headerText = servicesPage.getHeaderText();
		assertThat(headerText, equalTo("Services"));
	}

	@Test
	public void testThatNavigationToWorkPageWorks() {
		HomePage homePage = navigateToValtechWebsite();
		WorkPage workPage = homePage.navigateToWork();
		String headerText = workPage.getHeaderText();
		assertThat(headerText, equalTo("Work"));
	}

}
