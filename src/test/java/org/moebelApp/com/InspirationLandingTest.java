package org.moebelApp.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import moebelApp.InspirationLanding;

import org.moebelApp.com.Common;

public class InspirationLandingTest extends Base {
	
	
	@Test
	public void landingtoInspirationTest() throws Exception{
		new InspirationLanding()
		.landingtoInspiration();
		
		
		
	}

	
	
}
