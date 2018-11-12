package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CommonMethods {
	
	static AndroidDriver<MobileElement> driver;
	static WebDriverWait wait;
	
	public static void CommonMethods() {
	}
	
	public static void setUp() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "330038ae578b93c9");
		cap.setCapability("appPackage", "com.android.settings");
		cap.setCapability("appActivity", "com.android.settings.Settings");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
	}
	public static void turnOn(By path) {
		MobileElement wificonnection=driver.findElement(path);
		if (wificonnection.getAttribute("name").equals("OFF")) {
			wificonnection.click();
			WebDriverWait wait = new WebDriverWait(driver, 5000);
			wait.until(ExpectedConditions.textToBe(path, "ON"));
		}
	}
	public static void click(By path) {
		driver.findElement(path).click();
	}
	public static void HomeButton()
	{
		driver.pressKeyCode(AndroidKeyCode.HOME);
	}
	public static void closeConnection()
	{
		driver.closeApp();
	}

	
}
