package stepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.setupWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class screenshot extends setupWebDriver {
	@After
	public void takescreenshotOnFailure(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", scenario.getName());
		}

	}

}
