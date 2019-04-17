package by.htp.belavia.steps;

import by.htp.belavia.driver.WebDriverSingleton;
import by.htp.belavia.pages.MainPage;
import by.htp.belavia.pages.TicketPage;

public class Step {


    public static void closeDriver() {
        WebDriverSingleton.closeDriver();
    }

    public static void startSearh() {
        new MainPage()
                .chouseOneWay()
                .chousePlaceFrom("Минск")
                .chousePlaceWhere("Рига")
                .chouseDate();
    }

    public static void clickButtonSearch() {
        new MainPage().clickButton();
    }

    public static TicketPage getListOfTicket() {
        TicketPage ticketPage = new TicketPage();
        ticketPage.getListOfTicket();
        return ticketPage;
    }

}
