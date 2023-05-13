import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class HelloServlet extends HttpServlet {

  protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    String name = request.getParameter("name");
    HttpSession session = request.getSession();
    session.setAttribute("name", name);
    session.setAttribute("startTime", LocalDateTime.now());
    out.println("<html><body>");
    out.println("<h2>Hello, " + name + "!</h2>");
    out.println("<p>Start Time: " + LocalDateTime.now() + "</p>");
    out.println("<form action=\"LogoutServlet\" method=\"post\">");
    out.println("<input type=\"submit\" value=\"Logout\" />");
    out.println("</form>");
    out.println("</body></html>");
  }
}
