package org.PojoClass;

import org.BaseClase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseClass{
	
	public PojoClass() {
     
		PageFactory.initElements(d,this);
	}
	
	
	
@FindBy(xpath="//input[@aria-label='Search for images']")
public WebElement picname;



@FindBy(xpath="//button[@aria-label='Sch']")
public WebElement search;



@FindBy(xpath="//*[@href='/image-photo/close-macro-shot-european-garden-spider-1495428323']")
public WebElement spiderclick;




public WebElement getPicname() {
	return picname;
}






public WebElement getSearch() {
	return search;
}






public WebElement getSpiderclick() {
	return spiderclick;
}





}





