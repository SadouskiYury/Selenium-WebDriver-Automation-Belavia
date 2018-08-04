package by.htp.belavia;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.belavia.steps.Step;

public class TestMainBelaviaOneWay {
	private Step step;

	@BeforeMethod(description = "Init browser")
	public void setUp() {
		step = new Step();
		step.initDriver();
	}

	@Test
	public void SearchTicketOnWay() {
		step.startSearh();
		step.clickButtonSearch();
		step.getListOfTicket();
	}

	@AfterSuite(description = "Stop Browser")
	public void stopBrowser() throws InterruptedException {
		Thread.sleep(10000);
		step.closeDriver();
	}
}
