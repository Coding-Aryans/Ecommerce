package com.Pages.actions;

import com.BasePages.BasePage;

public class MensFilterWatchesPage extends BasePage {
	
	
	
	public MensFilterWatchesPage filterBydropDown() {
		pf.dropDownPrice();
		return new MensFilterWatchesPage();
	}
	

}
