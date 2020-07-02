package com.testcases;

import org.testng.annotations.Test;

import com.Pages.actions.MensPage;
import com.Pages.actions.MensMainWatchPage;

public class MensWatchePageTest extends BaseTest {

	@Test
	public void listOfCategoryInFilterSectionTest() {
		MensMainWatchPage men=new MensMainWatchPage();
		men.listOfCategoryInFilterSection();
	}
	

	@Test(priority = 2)
	public void FilterPriceRangeTest() {
		MensMainWatchPage men=new MensMainWatchPage();
		men.FilterScrollPrice();
	}
	
	
}
