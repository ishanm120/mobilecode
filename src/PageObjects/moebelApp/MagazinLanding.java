package moebelApp;

import java.util.List;

import org.moebelApp.com.Base;
import org.moebelApp.com.Common;
import org.openqa.selenium.WebElement;

public class MagazinLanding extends Base {

	static String magazinIcon = "moebel.de:id/tittleMagazine";
	static String catdropdown = "moebel.de:id/categoryLayout";
	static String catselection = "moebel.de:id/sort_option";
	static Common cmn = new Common();
	
	
	public static void landingToMagazinTest() throws Exception {
		cmn.waitAMoment(2000);
		InspirationLanding.landingtoInspiration();
		System.out.println("searching of magazin icon");
		cmn.clickByID(magazinIcon);
		cmn.waitAMoment(2000);
		cmn.clickByID(catdropdown);
		cmn.waitAMoment(2000);
		cmn.getList(catselection);
		cmn.matchWordandClick(catselection, "Wohntrends");
	}
}

