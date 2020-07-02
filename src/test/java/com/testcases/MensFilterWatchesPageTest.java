package com.testcases;

import org.testng.annotations.Test;

import com.Pages.actions.MensFilterWatchesPage;



public class MensFilterWatchesPageTest extends BaseTest {
	
	
	@Test
	public void AfterFilterDropDownTest() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MensFilterWatchesPage men=new MensFilterWatchesPage();
		men.filterBydropDown();
	}
	
	@Test(priority = 2)
	public void filterByBrands() {
		
		MensFilterWatchesPage men=new MensFilterWatchesPage();
		men.filterByBrands();
		men.sortBy();
	
	}
}
