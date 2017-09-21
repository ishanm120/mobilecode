package org.moebelApp.com;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;




public class Base {

	protected static AndroidDriver<WebElement> driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	    
	@BeforeSuite
	public void extentSetup(ITestContext context) {
		ExtentManager.setOutputDirectory(context);
		extent = ExtentManager.getInstance();
	}

	@BeforeMethod
	public void AppLaunchMethod(Method method) throws MalformedURLException, Exception {
		
		 ExtentTestManager.startTest(method.getName());
		
		DesiredCapabilities cap = new DesiredCapabilities();

		// Device specifications

		cap.setCapability("platformName", "Android");
		// cap.setCapability("deviceName", "92012825f6285347");
		cap.setCapability("deviceName", "9885b53254514b534e");

		cap.setCapability("app", "E:\\Automationdata\\Appinum Softwares\\Appium_Files_Amit\\ExtractedApks\\moebel.apk");
		// cap.setCapability("appPackage", "moebel.de");
	
		Common cmn= new Common();
		cmn.waitAMoment(2000);
		
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.pressKeyCode(AndroidKeyCode.HOME); 
		cap.setCapability("appActivity", "moebel.de.app.ui.activity.HomeActivity");


		
	}
/*
	@Test
	public void appinstalled() {
	
		System.out.println("app installed successfully");
	}
*/
	@AfterMethod
	public void closeApp(ITestResult result) {

		 ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));  // new
	        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));  // new

	        for (String group : result.getMethod().getGroups()) {
	            ExtentTestManager.getTest().assignCategory(group);  // new
	        }

	        if (result.getStatus() == 1) {
	            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");  // new
	        } else if (result.getStatus() == 2) {
	         String path = Common.getscreenshot(driver, result.getName());
	           // ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));  // new
	            String image = ExtentTestManager.getTest().addScreenCapture(path);
	        	ExtentTestManager.getTest().log(LogStatus.FAIL,getStackTrace(result.getThrowable()));
	        	ExtentTestManager.getTest().log(LogStatus.FAIL,image);
	        	driver.get(path);
	        } else if (result.getStatus() == 3) {
	            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");  // new
	        }

	        ExtentTestManager.endTest();  // new

	        extent.flush();
	        driver.quit();
	}
	
	@AfterSuite
    public void generateReport() {
        extent.close();
    }
	
	 private Date getTime(long millis) {
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTimeInMillis(millis);
	        return calendar.getTime();
	    }
	 
	  protected String getStackTrace(Throwable t) {
	        StringWriter sw = new StringWriter();
	        PrintWriter pw = new PrintWriter(sw);
	        t.printStackTrace(pw);
	        return sw.toString();
	    }

}
