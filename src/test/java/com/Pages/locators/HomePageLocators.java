package com.Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	public List<WebElement> Banner;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[4]/div/div[2]/div/div[1]/div/div[1]/div/a/div[2]")
	public WebElement Mobile;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	public WebElement BannerClose;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div/div[1]/div/h2")
	public WebElement Section_Header_One;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[4]/div/div[1]/div/h2")
	public WebElement Section_Header_Two;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[6]/div/div[1]/div/h2")
	public WebElement Section_Header_Last;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div/div[2]/button")
	public WebElement Section_Refresh;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div/div/div[2]/button")
	public List<WebElement> Refresh ;
	
	/*	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span")
	public WebElement ElectronicMenu;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul")
	public  List<WebElement> ElectronicMenuList;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/span")
	public WebElement TvAndAppliancesMenu;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[2]/div/ul/li[2]/ul")
	public List<WebElement>  TvAndAppliancesMenuList;*/
	
	
}
