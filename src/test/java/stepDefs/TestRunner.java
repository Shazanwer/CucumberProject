package stepDefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

//@CucumberOptions(features = "src\\test\\java\\feature", tags= {"@Sanity or (@Regression and @Rapid)"}, glue = { "stepDefs" })
@CucumberOptions(plugin = { "html:target/html-cucumber" }, features = "src\\test\\java\\feature", tags = {
		"@F_LoginPage and not @Ignore" }, glue = { "stepDefs" })

public class TestRunner {

}
