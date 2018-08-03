package by.htp.belavia.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import by.htp.belavia.util.PropertyManager;

public class WebDriverSingleton {
	private static WebDriver driver;

	private WebDriverSingleton() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty(PropertyManager.getChrome(), PropertyManager.getChromePath());
			driver = new ChromeDriver();
			System.out.println("Driver started");
		}
		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}

}
