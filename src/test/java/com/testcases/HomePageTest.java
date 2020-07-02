package com.testcases;




import org.testng.annotations.Test;


import com.Pages.actions.HomePage;

public class HomePageTest extends BaseTest {
	
  public static HomePage home;
	
	@Test(priority = 1)
	public void HomeTest() {
	//	HomePage home=new HomePage();
		home=new HomePage();
		home.Banner();
		//home.MensSection();
		//home.TvAndAppliancesMenu();
	}
	@Test(priority = 2)
	public void HomePageMensWatchTest() {
		//HomePage home=new HomePage();
		home=new HomePage();
		home.MensSection().watchSections();
	}
	
	
}
