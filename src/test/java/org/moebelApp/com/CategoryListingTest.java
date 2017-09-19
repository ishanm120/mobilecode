package org.moebelApp.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CategoryListingTest extends Base {
	@Test
	public void firstlevelCategory() throws Exception{
		
		String str = "abc";
		boolean found = false;
		while (!found) {

			List<WebElement> listingText = driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/title\")");
			System.out.println(listingText.size());
			for (WebElement ole : listingText) {
				System.out.println(ole.getText());
				if (ole.getText().equalsIgnoreCase("Essgruppen")) {
					str = ole.getText();
					
					driver.tap(1, ole, 1000);
					found = true;
					break;
				}
			}
			if (!found) {
				driver.swipe(517, 1590, 517, 410, 2000);
			}
		}

		
		
		
	
		
		
	}

}
