package org.moebelApp.com;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.core.annotation.SynthesizedAnnotation;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Base {

	protected static AndroidDriver<WebElement> driver;

	@BeforeMethod
	public void AppLaunchMethod() throws MalformedURLException {
		System.err.println("applaunch method");
		DesiredCapabilities cap = new DesiredCapabilities();

		// Device specifications

		cap.setCapability("platformName", "Android");
		// cap.setCapability("deviceName", "92012825f6285347");
		cap.setCapability("deviceName", "9885b53254514b534e");

		// App Specifications
  	      cap.setCapability("appActivity", "moebel.de.app.ui.activity.HomeActivity");
	      cap.setCapability("appPackage", "moebel.de");

		// to install new app
	//	cap.setCapability("app", "E:\\Automationdata\\Appinum Softwares\\Appium_Files_Amit\\ExtractedApks\\moebel.apk");

		// Launch app On Appium server

		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	/*@Test
	public void appinstalled(){
		System.out.println("app installed successfully");
	}*/

	@AfterMethod
	public void closeApp() {

		// driver.quit();
	}

}
