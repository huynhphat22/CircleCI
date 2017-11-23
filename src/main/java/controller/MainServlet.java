package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("calculator.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		BigDecimal result = BigDecimal.ZERO;
		char operator = request.getParameter("operator").charAt(0);
		try{
			result = calculate(request.getParameter("operand1"), request.getParameter("operand2"), operator);
		}catch(NumberFormatException e){
			result = BigDecimal.ZERO;
		}
		
		
		request.setAttribute("result", result);
		request.getRequestDispatcher("/result.jsp").forward(request, response);
		
	}
	
	public BigDecimal calculate(String Operand1, String Operand2, char operator)
						throws NumberFormatException{
		BigDecimal operand1 = new BigDecimal(Operand1);
		BigDecimal operand2 = new BigDecimal(Operand2);
		BigDecimal result = BigDecimal.ZERO;
		switch (operator) {
		case '+':
			result = operand1.add(operand2);
			break;
		case '-':
			result = operand1.subtract(operand2);
			break;
		case '*':
			result = operand1.multiply(operand2);
			break;
		case '/':
			result = operand1.divide(operand2, 2, RoundingMode.HALF_UP);
		default:
			break;
		}
		return result;
	}

}
