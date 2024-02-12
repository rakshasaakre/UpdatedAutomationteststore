package stepDefination;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Feature/login.feature", glue = { "stepDefination" },
                 plugin= "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
                
public class TestRunner {
	
	//@AfterClass
	//public static void writeExtentReport() {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	//}

}
