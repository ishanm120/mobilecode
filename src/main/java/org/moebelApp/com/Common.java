package org.moebelApp.com;

public class Common extends Base {
	
	public void clickEvent(String id){
		
		//driver.findElementByAndroidUIAutomator("Uiselector().resourceId(\"com.flipkart.android:id/btn_mlogin\")").click();
		driver.findElementByAndroidUIAutomator("Uiselector().resourceId(\"id\")").click();
		
		
	}

}
