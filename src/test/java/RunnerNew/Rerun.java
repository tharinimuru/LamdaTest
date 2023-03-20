package RunnerNew;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",
glue={"walmart.com"},
monochrome = true,
plugin={"html:Reports/htmlreport.html","json:Reports/jsonReport.json","rerun:target/rerun.txt"}) 
public class Rerun {

}
