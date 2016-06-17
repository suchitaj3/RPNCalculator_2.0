package test.java;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/seleniumTestGoogle")
//@CucumberOptions(features="src/test/resources/seleniumTestGoogle",glue="packageName",tags="~@pending",format = {"pretty", "html:target\cucumber" })
//~ mean not to execute, without ~ its to execute with this tag only.
public class TestseleniumTestRunner {

}
