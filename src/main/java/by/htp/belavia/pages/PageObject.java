package by.htp.belavia.pages;

import org.openqa.selenium.WebDriver;

public abstract class PageObject {
	protected WebDriver driver;

	public abstract void openPage();

	public PageObject(WebDriver driver) {
		this.driver = driver;
	}
}
