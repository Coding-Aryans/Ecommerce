package com.Pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParticularFiltersPageLoc {

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[2]/div/div[1]/div/ div/div/section[2]/div[4]/div[1]/select")
	public WebElement MinDrop;
}
