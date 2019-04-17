package by.htp.belavia.pages;

import org.openqa.selenium.WebDriver;

import static by.htp.belavia.driver.WebDriverSingleton.getDriver;

public abstract class PageObject {
	protected WebDriver driver;

	protected abstract void openPage();

	public PageObject(WebDriver driver) {
		this.driver = driver;
	}

    public PageObject() {
		this.driver = getDriver();

	}
}
