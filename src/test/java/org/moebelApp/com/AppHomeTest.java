package org.moebelApp.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AppHomeTest extends Base {

	@Test
	public void homePageverify() throws Exception {
		
		
		
		
		
		// List<WebElement> lst=
		// driver.findElementsByAndroidUIAutomator("UiSelector().className(\"android.widget.TextView\")");

		// driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/searchField\")").sendKeys("sofa");

		// Login
		/*
		 * driver.findElementByAndroidUIAutomator(
		 * "UiSelector().resourceId(\"moebel.de:id/profile\")").click();
		 * Thread.sleep(3000); driver.findElementByAndroidUIAutomator(
		 * "UiSelector().resourceId(\"moebel.de:id/input_email\")").sendKeys(
		 * "ishan@mailinator.com"); driver.findElementByAndroidUIAutomator(
		 * "UiSelector().resourceId(\"moebel.de:id/input_password\")").sendKeys(
		 * "123456"); driver.findElementByAndroidUIAutomator(
		 * "UiSelector().resourceId(\"moebel.de:id/tc_box\")").click();
		 * driver.findElementByAndroidUIAutomator(
		 * "UiSelector().resourceId(\"moebel.de:id/registration_button\")").
		 * click();
		 */

		// List<WebElement> hompageListing=
		// driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/shade\")");
		// System.out.println(hompageListing.size());
	//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++	
		//click on Essgruppen on Listing page

		boolean found = false;
		while (!found) {

			List<WebElement> listingText = driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/title\")");
			System.out.println(listingText.size());
			for (WebElement ole : listingText) {
				System.out.println(ole.getText());
				if (ole.getText().equalsIgnoreCase("Essgruppen")) {
					
					driver.tap(1, ole, 1000);
					found = true;
					break;
				}
			}
			if (!found) {
				driver.swipe(517, 1590, 517, 410, 2000);
			}
		}

		Thread.sleep(3000);

		// driver.pressKeyCode(AndroidKeyCode.HOME);

	}
}
