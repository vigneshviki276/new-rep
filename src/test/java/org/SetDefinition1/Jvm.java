package org.SetDefinition1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvm {

	public static void jvmReport(String h) {

		File o= new File("C:\\Users\\vignesh\\pictureCucumber\\AllProject\\Jvm");
		
		
		Configuration c=new Configuration(o,"FaceBook");
		c.addClassifications("platform", "Windows10");
		c.addClassifications("version","jdk1.8");
		c.addClassifications("doneBy","VIGNESH E");
		
		
		
		List<String> li=new ArrayList<String>();
		li.add(h);
		
		ReportBuilder r=new ReportBuilder(li,c);
	    r.generateReports();
	
	}
	
	
	
}
