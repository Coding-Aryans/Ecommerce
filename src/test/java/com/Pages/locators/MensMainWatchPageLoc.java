package com.Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MensMainWatchPageLoc {

	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/div/div/div/section/div[2]/div[1]/a")
	public WebElement Category;

	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/div/div/div/section/div[2]/div[2]/a")
     public List<WebElement> CategoryList;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[3]/div/div[1]/div/div/section[2]/div[3]/div[1]/div[1]")
	public WebElement Slider;
	
//	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/ div/div/section[2]/div[4]/div[1]/select")
//	public WebElement MinDrop;
}
