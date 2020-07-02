package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


import com.BasePages.BasePage;

public class BaseTest {
	@BeforeSuite
	public void setUp(){
		
		BasePage.initConfiguration();
	}

	@AfterSuite
	public void tearDown(){
		if(BasePage.driver!=null){
			//BasePage.tearDown();
		}
	}
}
