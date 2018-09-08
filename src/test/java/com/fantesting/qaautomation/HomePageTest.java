package com.fantesting.qaautomation;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fantesting.qaautomation.pages.HomePage;

public class HomePageTest extends BaseTest {
	
	@Test
	public void testThatRecentBlogsSectionIsDisplayed() {
		HomePage homePage = navigateToValtechWebsite();
		assertTrue(homePage.isRecentBlogSectionDisplayed());		
	}

}
