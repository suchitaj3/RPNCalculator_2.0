package test.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

import junit.framework.Assert;

public class seleniumTestSetpGenerator {

	private WebDriver driver = new FirefoxDriver();
	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  private String baseUrl = "http://ata123456789123456789.appspot.com/";
	  String result;


@Given("^user enter (\\d+) & (\\d+) in input box$")
public void user_enter_in_input_box(int arg1, int arg2) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	driver.get(baseUrl);
	driver.findElement(By.id("ID_nameField1")).clear();
	driver.findElement(By.id("ID_nameField1")).sendKeys("5");
	driver.findElement(By.id("ID_nameField2")).clear();
	driver.findElement(By.id("ID_nameField2")).sendKeys("4");
	//driver.findElement(By.id("ID_nameField3")).clear();...readOnly
	
}

@Given("^select option \"([^\"]*)\"$")
public void select_option(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	driver.findElement(By.id("gwt-uid-2")).click();
}

@When("^click on calculate$")
public void click_on_calculate() throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();	
	driver.findElement(By.id("ID_calculator")).click();
}

@Then("^result should be (\\d+)$")
public void result_should_be(String arg1) throws Throwable {
    // Express the Regexp above with the code you wish you had
    //throw new PendingException();
	result = driver.findElement(By.id("ID_nameField3")).getAttribute("value");
	Assert.assertEquals(result, arg1);
}




}
