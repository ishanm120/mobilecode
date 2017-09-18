package org.moebelApp.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.moebelApp.com.Common;

public class InspirationLanding extends Base {

	
	//public static String menu= "moebel.de:id/navigation_inspiration";
	public static void landingtoInspiration() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("searching of inspiration icon XYZ");
		Thread.sleep(5000);
		/*Common cmn= new Common();
		cmn.clickByID();*/
		
		//driver.findElementByAndroidUIAutomator("Uiselector().resourceId(\"moebel.de:id/navigation_inspiration\")").click();
		
		WebElement inspire = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/navigation_inspiration\")");
		inspire.click();
		Thread.sleep(5000);	
		
	}
}
