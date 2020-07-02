package com.Pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.BasePages.BasePage;
import com.Pages.locators.MensPageLoc;

public class MensPage extends BasePage  {
	
	
	public MensPageLoc MenLoc;

	public MensPage() {
		this.MenLoc = new MensPageLoc();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.MenLoc);
	}
	

	public MensMainWatchPage watchSections() {
		 click(MenLoc.MensMenuWatches);
		 return new MensMainWatchPage();
		
	}

}
