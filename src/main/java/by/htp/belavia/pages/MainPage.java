package by.htp.belavia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import by.htp.belavia.util.PropertyManager;

public class MainPage extends PageObject {
	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(PropertyManager.getBaseUrl());
		System.out.println("Main page opened");
	}

	public void chousePlace() {

	}

}
