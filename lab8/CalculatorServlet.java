import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    // Retrieve input values
    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");
    String op = request.getParameter("op");

    // Convert input strings to numbers
    double n1 = Double.parseDouble(num1);
    double n2 = Double.parseDouble(num2);

    // Perform calculation based on operator
    double result = 0;
    if (op.equals("+")) {
      result = n1 + n2;
    } else if (op.equals("-")) {
      result = n1 - n2;
    } else if (op.equals("*")) {
      result = n1 * n2;
    } else if (op.equals("/")) {
      result = n1 / n2;
    }

    // Set result as request attribute and forward to JSP
    request.setAttribute("result", result);
    RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
    rd.forward(request, response);
  }
}
