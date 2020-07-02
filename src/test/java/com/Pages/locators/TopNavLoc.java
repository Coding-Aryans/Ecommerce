package com.Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopNavLoc {

	

	@FindBy(xpath="/html/body/div[2]/div/div/button")
	public List<WebElement> Banner;
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	public WebElement BannerClose;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span")
	public WebElement ElectronicMenu;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul")
	public  List<WebElement> ElectronicMenuList;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/span")
	public WebElement TvAndAppliancesMenu;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/ul")
	public List<WebElement>  TvAndAppliancesMenuList;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/span")
	public WebElement  MensMenu;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[3]/ul/li/ul/li[4]/ul/li[1]/a")
	public WebElement  MensMenuWatches;
	
	
}
