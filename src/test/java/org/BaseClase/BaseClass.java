package org.BaseClase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass   {

      public  static  WebDriver d;
	
       	          
       	          
       	          
	public static void browser() {

		WebDriverManager.chromedriver().setup();
	
		d=new ChromeDriver();	
		
		d.manage().window().maximize();
	}
	
	
	public static void url() {
		
		d.get("https://www.shutterstock.com/");
	}
	
	
	
	public static void pictureName(WebElement us,String email) {

		us.sendKeys(email);	
	}

	
		
	public static void search(WebElement l) {
           l.click();
	}
	

	
	public static  void picClick(WebElement tt) {
      tt.click();
	}
	
   
	public static void screenShot() throws IOException {

	TakesScreenshot sc=(TakesScreenshot)d;
	
	File scrns = sc.getScreenshotAs(OutputType.FILE);
	
	
	File f=new File("C:\\Users\\vignesh\\pictureCucumber\\ScreenShot\\spiderpic.png");
	
	FileUtils.copyFile(scrns, f);
		
}
	
	
}