package moebelApp;

import org.moebelApp.com.Base;
import org.moebelApp.com.Common;

public class AppHome extends Base{
	
	static String homeIcon= "moebel.de:id/navigation_home";
	
	static String produktIcon= "moebel.de:id/navigation_produkt";
	static String merkzettelIcon= "android.view.View";
	static String inspirationIcon= "moebel.de:id/navigation_inspiration";
	static String shopfinderIcon= "moebel.de:id/navigation_shopfinder";
	
	
	static Common cmn = new Common();
	
	public void HomeLanding() {
		cmn.clickByClass(homeIcon);

	}
		
	public void MerkzettelLanding() {
		cmn.clickByClass(merkzettelIcon);

	}
	
	public void InspirationLanding() {
		cmn.clickByID(inspirationIcon);

	}
	
	public void ProduktLanding() {
		cmn.clickByID(produktIcon);

	}
	
	public void ShopfinderlLanding() {
		cmn.clickByID(shopfinderIcon);

	}

}
