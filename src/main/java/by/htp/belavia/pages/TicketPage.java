package by.htp.belavia.pages;

import by.htp.belavia.entity.Ticket;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

public class TicketPage extends PageObject {
	private static List<Ticket> listTicket;
	static {
		listTicket = new LinkedList();
	}
	private final By getDepartureTime = By.xpath("//div[@class='departure']//strong");
	private final By goToCalendar = By.xpath("//div[@class='hdr']/descendant::div[contains(@class,'text-right')]/a");
	private final By prices = By.xpath("//div[contains(@class,'fare')]/label");

	public TicketPage( ) {
		super();
		PageFactory.initElements(this.driver, this);

	}

	@Override
	public void openPage() {
		throw new UnsupportedOperationException();
	}

	public String getDepartureTime() {
		return driver.findElement(getDepartureTime).getText();
	}

	public List<Ticket> getListOfTicket() {
		if (existsElement(prices)) {
			List<WebElement> list = driver.findElements(prices);
			for (WebElement el : list) {
				Ticket ticket = new Ticket();

				// ticket.setPrice(Double.parseDouble(el.getText().replaceAll(",", ".")));
				// ticket.setDeparturetime(getDepartureTime());
				System.out.println(getDepartureTime());
				System.out.println(el.getText());
				listTicket.add(ticket);
			}
		}
		return listTicket;
	}

	private boolean existsElement(By id) {
		try {
			driver.findElement(id).isDisplayed();
			return true;
		} catch (NoSuchElementException e) {
			System.err.println("Element not found or is Emprty");
			return false;
		}
	}
}
