package org.TestRunnnerClass;

import org.SetDefinition1.Jvm;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\vignesh\\pictureCucumber\\Rerun\\fail.txt",glue="org.SetDefinition1",
plugin= {"json:C:\\Users\\vignesh\\pictureCucumber\\AllProject\\json\\facebook.json",})

	
public class TestRerunner extends Jvm{
	
	
	
	@AfterClass
	
	public static void report() {
         
		jvmReport("C:\\Users\\vignesh\\pictureCucumber\\AllProject\\json\\facebook.json");
		
		
		
	

	
	}
}
