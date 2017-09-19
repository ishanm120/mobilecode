package org.moebelApp.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import moebelApp.InspirationLanding;
import moebelApp.MagazinLanding;

public class MagazinLandingTest extends Base {
	
	
	@Test
	public static void landingToMagazinTest() throws Exception{
		
		InspirationLanding.landingtoInspiration();
		MagazinLanding.landingToMagazinTest();
		
	}
		

}
