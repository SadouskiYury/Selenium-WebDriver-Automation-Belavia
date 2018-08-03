package by.htp.belavia.steps;

import org.openqa.selenium.WebDriver;

import by.htp.belavia.driver.WebDriverSingleton;
import by.htp.belavia.pages.MainPage;

public class Step {
	private WebDriver driver;

	public void initDriver() {
		driver = WebDriverSingleton.getDriver();
	}

	public void closeDriver() {
		WebDriverSingleton.closeDriver();
	}

	public void startSearh() {
		MainPage main = new MainPage(driver);
		main.openPage();
	}
}
