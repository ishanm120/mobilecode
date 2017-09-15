package org.moebelApp.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InspirationLanding extends Base {

	
	@Test
	public static void landingtoInspiration() throws InterruptedException{
		Thread.sleep(3000);
		System.out.println("searching of inspiration icon XYZ");
		WebElement inspirationMenu= driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/navigation_inspiration\")");
		inspirationMenu.click();
		Thread.sleep(5000);	
		
	}
}
