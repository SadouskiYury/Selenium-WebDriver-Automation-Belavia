package by.htp.belavia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import by.htp.belavia.util.PropertyManager;

public class MainPage extends PageObject {

	private final By locationFrom = By.xpath("//input[@id='OriginLocation_Combobox']");
	private final By locationWhere = By.xpath("//input[@id='DestinationLocation_Combobox']");
	private final By chooseFrom = By.xpath("//*[@id='ui-id-2']//a");
	private final By selectRadioButtonWay = By.xpath("//label[@for='JourneySpan_Ow']");
	private final By chousenDateDeparture = By.xpath("//*[@id='datepicker']/div/div[1]/table/tbody//td[a=15]");
	private final By buttonFind = By.xpath("//button[contains(@class, 'btn btn-b2-green')]");

	
	
	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(PropertyManager.getBaseUrl());
		System.out.println("MainPage opened");
	}

	public void chousePlaceFrom(String from) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locationFrom));
		WebElement element = driver.findElement(locationFrom);
		element.sendKeys(from);
		driver.findElement(chooseFrom).click();
		element.sendKeys(Keys.ENTER);

	}

	public void chousePlaceWhere(String where) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locationWhere));
		WebElement element = driver.findElement(locationWhere);
		element.sendKeys(where);
		element.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void chouseOneWay() {
		WebElement button = driver.findElement(selectRadioButtonWay);
		button.click();
	}

	public void chouseDate() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(chousenDateDeparture));
		WebElement date = driver.findElement(chousenDateDeparture);
		date.click();
		date.sendKeys(Keys.TAB);
	}

	public TicketPage clickButton() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonFind));
		WebElement button = driver.findElement(buttonFind);
		button.click();
		return new TicketPage(driver);
	}
}
