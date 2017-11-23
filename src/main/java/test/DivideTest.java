package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.math.BigDecimal;

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
		AssertJUnit.assertEquals(expected, result);
	}

}
