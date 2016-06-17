package test.java;
import main.java.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator_Spec {
	
	Calculator rpn = new Calculator();
	
	@Test
	public void testRPN1(){

	//given:
	String string1 = "2,3,4,+,-";

	//when:
	double result = rpn.simpleAdd(string1);

	//then:
	assertEquals(-5.0, result, 0.0);

	}
}
