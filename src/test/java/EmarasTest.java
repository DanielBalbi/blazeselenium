import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features="src/test/java/features/demoblaze.feature",
		glue="steps",
		plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:reportes/report.html"})

public class EmarasTest extends AbstractTestNGCucumberTests{
	
}
