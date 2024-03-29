package CCRunner;

/* To execute the tests from this junit file in cmd prompt use the below maven command, Same command will be configured in jenkins. 
 * mvn test -Dtest=RunAll -DfailIfNoTests=false */

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = {"feature/Chapter1.feature", "feature/Chapter2.feature", "feature/Chapter3.feature",  "feature/Chapter4.feature", "feature/Chapter5.feature"},
				 glue = {"Chapter1_Tests", "Chapter2_Tests", "Chapter3_Tests","Chapter4_Tests","Chapter5.feature"},
				 dryRun = false,
				 monochrome = false,
				 format={"html:TestReports"},
				 plugin={"rerun:rerun/failed_scenarios.txt", "rerun:rerun/failed_scenarios1.txt", "rerun:rerun/failed_scenarios2.txt", "rerun:rerun/failed_scenarios3.txt"})


public class RunAll{}
