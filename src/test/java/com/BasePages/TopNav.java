package com.BasePages;

import static com.CommonUtil.Utilis.getAllLinks;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.Pages.actions.MensPage;
import com.Pages.actions.MensMainWatchPage;
import com.Pages.locators.TopNavLoc;

public class TopNav extends BasePage{
	public TopNavLoc home;

	public TopNav() {

		this.home = new TopNavLoc();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 10);
		PageFactory.initElements(factory, this.home);

	}

	public void ElectronicMenu() {

		String nameofCurrMethod = new Object() {
		}.getClass().getEnclosingMethod().getName();

		click(home.ElectronicMenu);
		getAllLinks(home.ElectronicMenuList, nameofCurrMethod);

	}

	public void TvAndAppliancesMenu() {
		String nameofCurrMethod = new Object() {
		}.getClass().getEnclosingMethod().getName();

		click(home.TvAndAppliancesMenu);
		getAllLinks(home.TvAndAppliancesMenuList, nameofCurrMethod);
	}

	public MensPage MensMenu() {
		String nameofCurrMethod = new Object() {
		}.getClass().getEnclosingMethod().getName();
		
      click(home.MensMenu);
   //   click(home.MensMenuWatches);
	    return new MensPage();
     
		
	}

	public void WomensMenu() {

	}

	public void BabyKidsMenu() {

	}

	public void HomeAndFurnitureMenu() {

	}

	public void SportsAndMoreMenu() {

	}

	public void OfferZoneMenu() {

	}

	public void search() {

	}

	public void Login() {

	}

	public void More() {

	}

	public void cart() {

	}

}
