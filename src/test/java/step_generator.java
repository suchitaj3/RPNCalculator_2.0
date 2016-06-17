package test.java;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
//import junit.framework.Assert;
import main.java.Calculator;
import static org.junit.Assert.*;

public class step_generator {
	double result;
	
	@Given("^user enter \"([^\"]*)\"$")
	public void user_enter(String arg1) throws Throwable {
		//arg1 = "2,2,+";
		Calculator rpn = new Calculator();
		result = rpn.simpleAdd(arg1);
		System.out.println("sdfsg"+result);
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^result be \"([^\"]*)\"$")
	public void result_be(String arg1) throws Throwable {
		Assert.assertEquals(result, Double.parseDouble(arg1),0);
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

}
