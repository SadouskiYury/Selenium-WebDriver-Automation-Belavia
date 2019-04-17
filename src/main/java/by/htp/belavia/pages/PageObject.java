package by.htp.belavia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static by.htp.belavia.driver.WebDriverSingleton.getDriver;

public abstract class PageObject {
	protected WebDriver driver;

	protected abstract void openPage();

	public PageObject(WebDriver driver) {
		this.driver = driver;
	}

    public PageObject() {
		this.driver = getDriver();
		new WebDriverWait(driver,30).until(ExpectedConditions.titleIs(driver.getTitle()));
//		new WebDriverWait(driver,30).until(ExpectedCondition<openPage();>)

	}
}
