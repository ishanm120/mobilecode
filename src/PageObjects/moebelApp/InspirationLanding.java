package moebelApp;

import org.moebelApp.com.Common;

public class InspirationLanding {
	
	
	public static String menu = "moebel.de:id/navigation_inspiration";
	
	static Common cmn = new Common();

	public static void landingtoInspiration() throws InterruptedException {

		cmn.waitAMoment(2000);		
		cmn.clickByID(menu);
		cmn.waitAMoment(2000);
	}

}
