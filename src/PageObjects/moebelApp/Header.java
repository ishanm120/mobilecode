package moebelApp;

import org.moebelApp.com.Base;
import org.moebelApp.com.Common;

import io.appium.java_client.android.AndroidKeyCode;

public class Header extends Base {
	
	
    static String searchBox= "moebel.de:id/searchField";
	
	static String profileIcon= "moebel.de:id/profile";
	static String emailBoxReg= "moebel.de:id/input_email";
	static String passwordBoxReg= "moebel.de:id/input_password";
	static String tcBox = "moebel.de:id/tc_box";
	static String registerbutton= "moebel.de:id/registration_button";
	static String facebookbutton= "moebel.de:id/facebook_button";
	static String loginbutton= "moebel.de:id/login_button";
	
	static String loginEmailBox= "moebel.de:id/login_email";
	static String loginpasswordBox= "moebel.de:id/login_password";
	
	static String crossButton= "moebel.de:id/close";
	static String forgetPasswordLink= "moebel.de:id/login_forget_pass";
	
	
	
	static Common cmn = new Common();
	
	public static void searchverify() throws Exception{
		cmn.waitAMoment(2000);
		cmn.sendKeysEvent(searchBox, "sofas");

	}
	
	public static void ProfileIconclick(){
		
		cmn.clickByID(profileIcon);
	}
	
	public static void RegisterVerify() throws Exception{
		cmn.sendKeysEvent(emailBoxReg, "ishan@mailinator.com");
		cmn.waitAMoment(1000);
		cmn.sendKeysEvent(passwordBoxReg, "123456");
		cmn.clickByID(tcBox);
		cmn.clickByID(registerbutton);		
				
	}
	
public static void LoginButtonclick(){
		
		cmn.clickByID(loginbutton);
	}
	
	
	public static void LoginVerify() throws Exception{
		cmn.waitAMoment(1000);
		cmn.sendKeysEvent(loginEmailBox, "ishan@mailinator.com");
		cmn.waitAMoment(1000);
		cmn.sendKeysEvent(loginpasswordBox, "123456");
	    driver.hideKeyboard();
		cmn.waitAMoment(1000);
			
				
	}
	

}
