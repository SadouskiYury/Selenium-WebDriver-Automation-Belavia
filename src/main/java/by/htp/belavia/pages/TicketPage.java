package by.htp.belavia.pages;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import by.htp.belavia.entity.Ticket;

public class TicketPage extends PageObject {
	private static List<Ticket> listTicket;
	static {
		listTicket = new LinkedList();
	}
	private final By getDepartureTime = By.xpath("//div[@class='departure']//strong");
	private final By goToCalendar = By.xpath("//div[@class='hdr']/descendant::div[contains(@class,'text-right')]/a");
	private final By prices = By.xpath("//div[contains(@class,'fare')]/label");

	public TicketPage(WebDriver driver) {
		super(driver);

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
				ticket.setPrice(Double.parseDouble(el.getText().replaceAll(",", ".")));
				ticket.setDeparturetime(getDepartureTime());
				System.out.println(getDepartureTime());
				System.out.println(el.getText());
				listTicket.add(ticket);
			}
		}
		return listTicket;
	}

	private boolean existsElement(By id) {
		try {
			driver.findElement(id);
			return true;
		} catch (NoSuchElementException e) {
			System.err.println("Element not found or is Emprty");
			return false;
		}
	}
}
