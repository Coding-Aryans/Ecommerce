package com.Pages.actions;

import com.BasePages.BasePage;

public class MensFilterWatchesPage extends BasePage {
	
	
	
	public MensFilterWatchesPage filterBydropDown() {
		pf.dropDownPrice();
		//pf.checkOnBrands();
		return new MensFilterWatchesPage();
	}
	
    public void FilterByBrands() {
    	pf.checkOnBrands();
    	
    }

}
