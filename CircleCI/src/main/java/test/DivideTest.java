package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import controller.MainServlet;

public class DivideTest {
	String operand1 = "2";
	String operand2 = "0.15993";
	char operator = '/';
	MainServlet servlet = new MainServlet();
	@Test
	public void test() {
		BigDecimal result = servlet.calculate(operand1, operand2, operator);
		BigDecimal expected = new BigDecimal("12.51");
		assertEquals(expected, result);
	}

}
