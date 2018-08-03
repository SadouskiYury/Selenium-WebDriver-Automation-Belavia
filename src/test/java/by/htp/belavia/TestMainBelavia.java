package by.htp.belavia;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.belavia.steps.Step;

public class TestMainBelavia {
	private Step step;

	@BeforeMethod(description = "Init browser")
	public void setUp() {
		step = new Step();
		step.initDriver();
	}

	@Test
	public void Search() {
		step.startSearh();	
		
	}
	@AfterTest(description = "Stop Browser")
	public void stopBrowser() {
		step.closeDriver();
	}
}
