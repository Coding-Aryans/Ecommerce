package com.Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParticularFiltersPageLoc {

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/ div/div/section[2]/div[4]/div[1]/select")
	public WebElement MinDrop;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/section[4]/div[1]/div")
	public WebElement Brands;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/section[4]/div[2]/div[1]/div[2]/div/div/label/div[1]")
	public WebElement BrandsCheck;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/div/div/section[4]/div[2]/div[1]/div[1]/input")
	public WebElement BrandSearch;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]")
	public WebElement SortBy;
}
//*[@id="container"]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[3]/div[2]