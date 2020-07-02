package com.BasePages;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.Pages.actions.HomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	
	
	public static WebDriver driver;
	
	public static  TopNav top;
	public static  ParticlarFilters pf;
	public static void initConfiguration(){
		
		if(PageConfig.BROWSER_NAME.equals("chrome")) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			prefs.put("credentials_enable_service", false);
			prefs.put("profile.password_manager_enabled", false);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-extensions");
			options.addArguments("--disable-infobars");

			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(options);
		}
		else if(PageConfig.BROWSER_NAME.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.get(PageConfig.testsiteurl);
		driver.manage().window().maximize();
	top=new TopNav();	
	pf=new ParticlarFilters();
	}
	
/*	public static boolean IsElementPresent(List<WebElement> element) {
		
	if(element.size()!=0) {
		return true;
	}
	else
	{
		return false;
	}
		
	}*/
	public static void click(WebElement element) {
        System.out.println(element.getText());
		element.click();
		
	}
	public static void type(WebElement element) {
		element.sendKeys("fastrack");
	}
	public static void scroll(WebElement element) {
 	
// 	 JavascriptExecutor js=(JavascriptExecutor) driver;
//		
//		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//		js.executeScript("arguments[0].scrollIntoView();",element );
//		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView();",element );
    }
	public static void scrollup() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,-1000)");
		 js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
	}
/*	public static void getAllData(List<WebElement> element,String nameofCurrMethod)  {
		 File f = null;
		String meth=nameofCurrMethod;
		String path="C:\\Users\\Akshay Katoch\\eclipse-workspace\\Ecommerce\\src\\test\\resources\\links\\"+meth+".txt";
		try {
		 f=new File(path);
		
			if(f.createNewFile()) {
				System.out.println("its crested");
			}
			else {
				System.out.println("exited");
			}
		
		
		 for (WebElement webElement : element) {
			//System.out.println(webElement.getText());
			      
			FileWriter fw=new FileWriter(f);
			BufferedWriter br=new BufferedWriter(fw);
			br.write(webElement.getText());
			br.close();
			}
		}
		catch(Throwable t) {
			System.out.println(t.getStackTrace());
		}
		
		}*/
		
	public void actionOnElements(WebElement element) {
		Actions a=new Actions(driver);
		a.dragAndDropBy(element, 65, 0).perform();
	}
	
	public void dropDown(WebElement element) {
	
		Select drop=new Select(element);
		drop.selectByValue("500");
	}
	
	public void check(WebElement element) {
		element.click();
		
	}
	public static void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
