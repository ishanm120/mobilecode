package org.moebelApp.com;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import moebelApp.Header;

public class HeaderTest extends Base {
	
	
/*	@Test
	public void searchverifyTest() throws Exception{
		
		//Header.searchverify();
		WebElement searchField = driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/searchField\")");
		System.out.println(searchField.getText());
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys("sofaaaaa");
		System.out.println("text is typed");
		Thread.sleep(2000);
		System.out.println("searching for searchbox");
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/searchField\")").click();
		Thread.sleep(2000);
		System.out.println("typing text");
		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"moebel.de:id/searchField\")").sendKeys("12345");		
	}*/
	
	
	/*@Test
	public void ResiterVerifyTest() throws Exception{	
		Header.ProfileIconclick();
		Header.RegisterVerify();
	}*/
	
	@Test
	public void LoginVerifyTest() throws Exception{
		Header.ProfileIconclick();
		Header.LoginButtonclick();
		Header.LoginVerify();
		Header.LoginButtonclick();
	}
	
}
