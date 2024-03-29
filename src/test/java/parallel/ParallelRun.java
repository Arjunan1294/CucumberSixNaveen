package parallel;


import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/parallel/LoginPage.feature"},
		glue = {"parallel"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true,
		tags="@Smoke"
		)

public class ParallelRun extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
	
}
