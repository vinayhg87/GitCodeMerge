package CCRunner;

/* To execute the tests from this junit file in cmd prompt use the below maven command, Same command will be configured in jenkins. 
 * mvn test -Dtest=RunFailed -DfailIfNoTests=false */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@rerun/failed_scenarios.txt"},
				 glue = {"Chapter1_Tests","Chapter2_Tests"},
				 dryRun = false,
				 monochrome = false,
				 format = { "pretty", "html:target/cucumber-report/single"})


public class RunFailed {}
