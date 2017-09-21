package org.moebelApp.com;


import org.testng.ITestContext;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	 private static ExtentReports extent;
	 private static ITestContext context;
      
	    public synchronized static ExtentReports getInstance() {
	        if (extent == null) {
	            //File outputDirectory = new File(context.getOutputDirectory());
	            //File resultDirectory = new File(outputDirectory.getParentFile(), "html");
	            extent = new ExtentReports(Common.getConfigValue("filePath"));
	           // Reporter.log("Extent Report directory: " + resultDirectory, true);
	        }

	        return extent;
	    }

	    public static void setOutputDirectory(ITestContext context) {
	        ExtentManager.context = context;
	    }

}
