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
	
	public ParticlarFilters dropDownPrice() {
		//click(MenLoc.MinDrop);
		dropDown(FMenLoc.MinDrop);
		return this;
		
	}
	
	
	public ParticlarFilters checkOnBrands() {
		System.out.println(FMenLoc.Brands.getText());
		type(FMenLoc.BrandSearch);
		check(FMenLoc.BrandsCheck);
		return this;
	}

}
