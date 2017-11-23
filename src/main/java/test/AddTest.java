package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import controller.MainServlet;

public class AddTest {
	String operand1 = "125446";
	String operand2 = "156444879";
	char operator = '+';
	MainServlet servlet = new MainServlet();

	@Test
	public void test() {
		BigDecimal result = servlet.calculate(operand1, operand2, operator);
		BigDecimal expected = new BigDecimal("156570325");
		assertEquals(expected, result);

	}

}
