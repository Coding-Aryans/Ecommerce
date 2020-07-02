package com.CommonUtil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Utilis {
	
	
	public static boolean IsElementPresent(List<WebElement> element) {
		
		if(element.size()!=0) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void getAllLinks(List<WebElement> element,String nameofCurrMethod)  {
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
		
		}

	
	

           


}


