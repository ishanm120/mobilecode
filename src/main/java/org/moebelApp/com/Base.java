package org.moebelApp.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Base {

	protected static AndroidDriver<WebElement> driver;

	@BeforeMethod
	public void AppLaunchMethod() throws MalformedURLException, Exception {
		System.err.println("applaunch method");
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
	public void closeApp() {

		// driver.quit();
	}

}
