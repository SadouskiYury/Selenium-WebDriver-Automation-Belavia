package by.htp.belavia.pages;

import by.htp.belavia.entity.Element;
import by.htp.belavia.util.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import static java.lang.String.format;

public class MainPage extends PageObject {

	private final By locationFrom = By.xpath("//input[@id='OriginLocation_Combobox']");
	private final By locationWhere = By.xpath("//input[@id='DestinationLocation_Combobox']");
	private final By chooseFrom = By.xpath("//*[@id='ui-id-2']//a");
	private final By selectRadioButtonWay = By.xpath("//label[@for='JourneySpan_Ow']");
	private final By chousenDateDeparture = By.xpath("//*[@id='datepicker']/div/div[1]/table/tbody//td[a=15]");
	private final By buttonFind = By.xpath("//button[contains(@class, 'btn btn-b2-green')]");

	
	

    public MainPage() {
        super();
        PageFactory.initElements(this.driver, this);
        openPage();
    }
	@Override
	protected void openPage() {
		driver.navigate().to(PropertyManager.getBaseUrl());
		System.out.println(format("Opened the web site: %s",driver.getTitle()));
		System.out.println("MainPage opened");
	}

	public MainPage chousePlaceFrom(String from) {
		new Element(locationFrom).sendKeys(from);
		Element chouseFrom=new Element(chooseFrom);
		chouseFrom.click();
		new Element(locationFrom).sendKeys(Keys.ENTER);
		return this;

	}

	public MainPage chousePlaceWhere(String where) {
		new Element(locationWhere).sendKeys(where);
		new Element(locationWhere).sendKeys(Keys.ENTER);
		return this;
	}

	public MainPage chouseOneWay() {
		new Element(selectRadioButtonWay).click();
		return this;
	}

	public MainPage chouseDate() {
		new Element(chousenDateDeparture).click();
		new Element(chousenDateDeparture).sendKeys(Keys.TAB);
		return this;
	}

	public TicketPage clickButton() {
		new Element(buttonFind).click();
		return new TicketPage();
	}
	
}
