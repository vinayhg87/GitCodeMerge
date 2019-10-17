package CCRunner;

/* To execute the tests from this junit file in cmd prompt use the below maven command, Same command will be configured in jenkins. 
 * mvn test -Dtest=RunAll -DfailIfNoTests=false */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"feature/Chapter1.feature", "feature/Chapter2.feature"},
				 glue = {"Chapter1_Tests", "Chapter2_Tests"},
				 dryRun = false,
				 monochrome = false,
				 format={"html:TestReports"},
				 plugin={"rerun:rerun/failed_scenarios.txt"})


public class RunAll{}
