package by.htp.belavia.steps;

import org.openqa.selenium.WebDriver;

import by.htp.belavia.driver.WebDriverSingleton;
import by.htp.belavia.pages.MainPage;
import by.htp.belavia.pages.TicketPage;

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
		main.chouseOneWay();
		main.chousePlaceFrom("Минск");
		main.chousePlaceWhere("Рига");
		main.chouseDate();
	}

	public TicketPage clickButtonSearch() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickButton();
		return new TicketPage(driver);
	}
	
}
