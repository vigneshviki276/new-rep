package org.TestRunnnerClass;

import org.SetDefinition1.Jvm;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\vignesh\\pictureCucumber\\src\\test\\resources\\FeatureFiles",glue="org.SetDefinition1",dryRun=false,
plugin= {"junit:C:\\Users\\vignesh\\pictureCucumber\\AllProject\\junit\\yt.xml"
		,"json:C:\\Users\\vignesh\\pictureCucumber\\AllProject\\json\\facebook.json",
		"html:C:\\Users\\vignesh\\pictureCucumber\\AllProject\\Html",
		"rerun:C:\\Users\\vignesh\\pictureCucumber\\Rerun\\fail.txt"})


public class TestRunner extends Jvm{

	
	
	@AfterClass
	
	public static void report() {
         
		jvmReport("C:\\Users\\vignesh\\pictureCucumber\\AllProject\\json\\facebook.json");
		
		
		
	}
	
	
}