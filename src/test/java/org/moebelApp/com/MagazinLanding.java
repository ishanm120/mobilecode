package org.moebelApp.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MagazinLanding extends Base {
	
	
	@Test
	public static void landingToMagazin() throws InterruptedException{
		Thread.sleep(3000);
		//InspirationLanding iplanding= new InspirationLanding();
		InspirationLanding.landingtoInspiration();
		//iplanding.landingtoInspiration();
		System.out.println("searching of magazin icon");
		WebElement magazinIcon= driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/tittleMagazine\")");
		magazinIcon.click();
		Thread.sleep(3000);
		System.out.println("test messgae to check for git");
		WebElement catdropdown= driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/categoryLayout\")");
		catdropdown.click();
		Thread.sleep(5000);
		List<WebElement> catselction= driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/sort_option\")");
		System.out.println(catselction.size());
		for(WebElement catname: catselction){
			if(catname.getText().equalsIgnoreCase("Wohntrends")){
				catname.click();
			}
			
		}
	}

}
