package by.htp.belavia.steps;

import by.htp.belavia.driver.WebDriverSingleton;
import by.htp.belavia.pages.MainPage;
import by.htp.belavia.pages.TicketPage;

public class Step {



	public static void closeDriver() {
		WebDriverSingleton.closeDriver();
	}

	public static void startSearh() {
		MainPage main = new MainPage();
		main.chouseOneWay();
		main.chousePlaceFrom("Минск");
		main.chousePlaceWhere("Рига");
		main.chouseDate();
	}

	public static void clickButtonSearch() {
		MainPage mainPage = new MainPage();
		mainPage.clickButton();
	}

	public static TicketPage getListOfTicket() {
		TicketPage ticketPage = new TicketPage();
		ticketPage.getListOfTicket();
		return ticketPage;
	}

}
