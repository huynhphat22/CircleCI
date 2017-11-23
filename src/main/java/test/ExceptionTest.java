package test;

import org.junit.Test;

import controller.MainServlet;

public class ExceptionTest {
	String operand1 = "a";
	String operand2 = "s";
	char operator = '+';
	MainServlet servlet = new MainServlet();
	
	@Test(expected = NumberFormatException.class)
	public void test() {
		servlet.calculate(operand1, operand2, operator);
	}

}
