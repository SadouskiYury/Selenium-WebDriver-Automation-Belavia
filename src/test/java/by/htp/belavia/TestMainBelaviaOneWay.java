package by.htp.belavia;

import by.htp.belavia.driver.WebDriverSingleton;
import by.htp.belavia.steps.Step;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestMainBelaviaOneWay {
	private Step step;

	@BeforeSuite(description = "Init browser")
	public void setUp() {
        WebDriverSingleton.getDriver();
	}

	@Test
	public void SearchTicketOnWay() {
		step.startSearh();
		step.clickButtonSearch();
		step.getListOfTicket();
	}

	@AfterSuite(description = "Stop Browser")
	public void stopBrowser() throws InterruptedException {
//	    TO DO Take screen short if test failed
		step.closeDriver();
	}
}
