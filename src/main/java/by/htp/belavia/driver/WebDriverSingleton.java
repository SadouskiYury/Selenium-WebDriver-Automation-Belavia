package by.htp.belavia.driver;

import by.htp.belavia.util.PropertyManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {
	private static WebDriver driver;

	private WebDriverSingleton() {
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty(PropertyManager.getChrome(), PropertyManager.getChromePath());
			ChromeOptions options=new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);
			System.out.println("Driver started");
		}
		return driver;
	}

	public static void closeDriver() {
		driver.quit();
		driver = null;
	}

}
