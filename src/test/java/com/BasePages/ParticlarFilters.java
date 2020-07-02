package com.BasePages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.Pages.locators.ParticularFiltersPageLoc;

public class ParticlarFilters extends BasePage {
	public ParticularFiltersPageLoc FMenLoc;	
    
	public ParticlarFilters(){
		this.FMenLoc = new  ParticularFiltersPageLoc();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.FMenLoc);
	}
	
	public void dropDownPrice() {
		//click(MenLoc.MinDrop);
		dropDown(FMenLoc.MinDrop);
		
	}

}
