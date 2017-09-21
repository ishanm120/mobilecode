package org.moebelApp.com;

import java.io.File;
import java.io.FileReader;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Common extends Base {

	protected static FileReader reader;
	protected static Properties properties;

	public void clickByID(String id) {

		driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"" + id + "\")").click();

	}

	public void clickByClass(String className) {

		driver.findElementByAndroidUIAutomator("Uiselector().className(\"" + className + "\")").click();
	}
	
	public void sendKeysEvent(String id, String searchkeyword) {
		WebElement textBox= driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\"" + id + "\")");
		textBox.sendKeys(searchkeyword);
		
		

	}
	
	

	public void waitAMoment(int i) throws InterruptedException {

		Thread.sleep(i);
	}

	public List<WebElement> getList(String id) {

		List<WebElement> elements = driver.findElementsByAndroidUIAutomator("UiSelector().resourceId(\"" + id + "\")");
		return elements;

	}

	public void matchWordandClick(String id, String searchWord) {

		List<WebElement> listElements = getList(id);

		for (WebElement welement : listElements) {
			if (welement.getText().equalsIgnoreCase(searchWord)) {
				welement.click();
			}

		}

	}

	public void matchWordandTap(String id, String searchWord, int time) {

		List<WebElement> listElements = getList(id);

		for (WebElement welement : listElements) {
			if (welement.getText().equalsIgnoreCase(searchWord)) {
				tapEvent(welement, time);
			}

		}

	}

	public void scrolltillElementSamsung(String id, String searchWord, int sX, int sY, int eX, int eY, int time1,
			int time2) {

		boolean found = false;
		while (!found) {

			List<WebElement> listingText = getList(id);
			for (WebElement ole : listingText) {
				System.out.println(ole.getText());
				if (ole.getText().equalsIgnoreCase(searchWord)) {

					tapEvent(ole, time1);

					found = true;
					break;
				}
			}
			if (!found) {
				// driver.swipe(517, 1590, 517, 410, 2000);
				swipeEvent(sX, sY, eX, eY, time2);
			}
		}
	}

	public void tapEvent(WebElement element, int time) {
		driver.tap(1, element, time);
	}

	public void swipeEvent(int stX, int stY, int endX, int endY, int time) {
		driver.swipe(stX, stY, endX, endY, time);

	}
	
	
	public Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}
	
	
	public static String getConfigValue(String key){
		String val=null;
		try {
			reader = new FileReader("configMobile.properties");
			properties = new Properties();
			properties.load(reader);
			val = properties.getProperty(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return val;
	}
	public static String getscreenshot(WebDriver driver,String screenshotName)
    {    
		String filePath=null;
		try{
            File scrnFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            filePath  = "E:\\workspace\\HomeSofaMobile\\ScreenshotsMobile\\"+screenshotName+".png";
            FileUtils.copyFile(scrnFile, new File(filePath));
            
    }catch(Exception e){
    	   e.printStackTrace();
    }
    
	return filePath;
    }
}
