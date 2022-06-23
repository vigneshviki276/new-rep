package org.SetDefinition1;

import java.io.IOException;

import org.BaseClase.BaseClass;
import org.PojoClass.PojoClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetDefinition1 extends BaseClass {
	
	
	
@Given("user have to enter in shutterStock website")
public void user_have_to_enter_in_shutterStock_website() {
   browser();
   url();
	
}

@When("user have to click search image box and pass value of spider")
public void user_have_to_click_search_image_box_and_pass_value_of_spider() {
	PojoClass p=new PojoClass();
	
	pictureName(p.getPicname(),"spider");
	
	
	
	
	
}

@And("user have to click search button")
public void user_have_to_click_search_button() {
   
	PojoClass p=new PojoClass();
	
	search(p.getSearch());
}

@And("user have to click any one of the spider shown in the website")
public void user_have_to_click_any_one_of_the_spider_shown_in_the_website() throws InterruptedException {
	
	Thread.sleep(5000);
	
	PojoClass p=new PojoClass();
	
	picClick(p.getSpiderclick());
    

}

@And("user have to take screenshot of the maximized spider")
public void user_have_to_take_screenshot_of_the_maximized_spider() throws IOException, InterruptedException {
    Thread.sleep(5000);
	screenShot();
	
}

@Then("user should be in maximized spider webpage")
public void user_should_be_in_maximized_spider_webpage() {
    
	
	
	String crurl = d.getCurrentUrl();
		if (crurl.contains("garden-spider-1495428323")) {
			
			System.out.println("user is really in maximized spiderpage ");
			
		} else {
			
			System.out.println("user is not in the maximized page of spider");
			

		}
}



}
