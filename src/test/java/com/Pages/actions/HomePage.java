package com.Pages.actions;

import java.lang.reflect.Method;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.BasePages.BasePage;
import static com.CommonUtil.Utilis.*;
import com.Pages.locators.HomePageLocators;

public class HomePage extends BasePage {

	public HomePageLocators home;
	

	public HomePage() {

		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);

	}

	public HomePage Banner() {
		if (IsElementPresent(home.Banner)) {
			click(home.BannerClose);

		}
		return this;
	}

	public HomePage CheckListOfLinksInMenus() {
		top.ElectronicMenu();
		top.TvAndAppliancesMenu();
		return this;
	
	}
	
 
	 public HomePage Section() {
			scroll(home.Section_Header_One);
		 System.out.println(home.Section_Header_One.getText());		
		 scroll(home.Section_Header_Two);
		 System.out.println(home.Section_Header_Two.getText());
		 System.out.println("if statement checks");
		 if (IsElementPresent(home.Refresh)) {
				click(home.Section_Refresh);

		 }
		// System.out.println("if statement checks complete");
		 
		 
		 scroll(home.Section_Header_Two);
		 System.out.println(home.Section_Header_Two.getText());
		 System.out.println("third check");
		 try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 scroll(home.Section_Header_Last);
		 System.out.println(home.Section_Header_Last.getText());
		 return this;
		 
	 }
	 
	 public MensPage MensSection() {
	//	scrollup();
		 top.MensMenu();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new MensPage();
		 
	 }
    
	

}
