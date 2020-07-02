package com.Pages.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.BasePages.BasePage;
import com.Pages.locators.MensMainWatchPageLoc;
import com.Pages.locators.MensPageLoc;
import com.Pages.locators.TopNavLoc;

public class MensMainWatchPage extends BasePage {

	
    public MensMainWatchPageLoc MenLoc;	
    
	public MensMainWatchPage(){
		this.MenLoc = new  MensMainWatchPageLoc();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.MenLoc);
	}
	
	public MensMainWatchPage listOfCategoryInFilterSection() {

		
		System.out.println(MenLoc.Category.getText());
		int size=MenLoc.CategoryList.size()	;
		System.out.println(size);
		for (WebElement webElement : MenLoc.CategoryList) {
			System.out.println(webElement.getText());
		}
		return new MensMainWatchPage();
	}
	
	public MensFilterWatchesPage FilterScrollPrice() {
		actionOnElements(MenLoc.Slider);
		return new MensFilterWatchesPage();
	
	}
	
	public MensFilterWatchesPage changeRangeOfPriceByDropBox() {
		return new MensFilterWatchesPage();
		
	}
	public MensFilterWatchesPage filterBrand() {
		return new MensFilterWatchesPage();
		
	}
}
