package steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"steps"},

		monochrome = true,
	plugin=	{"html:target/Htmlreport/report.html"},
	tags = "@devTest"
	)
public class Testrunner {
	
	
	

}
