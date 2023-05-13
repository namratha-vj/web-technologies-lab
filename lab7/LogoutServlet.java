import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

  protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response
  ) throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    HttpSession session = request.getSession(false);
    if (session != null) {
      String name = (String) session.getAttribute("name");
      LocalDateTime startTime = (LocalDateTime) session.getAttribute(
        "startTime"
      );
      Duration duration = Duration.between(startTime, LocalDateTime.now());
      session.invalidate();
      out.println("<html><body>");
      out.println("<h2>Thank You, " + name + "!</h2>");
      out.println(
        "<p>Duration of Usage: " + duration.toMinutes() + " minutes</p>"
      );
      out.println("</body></html>");
    } else {
      out.println("<html><body>");
      out.println("<h2>Error: Session Expired!</h2>");
      out.println("</body></html>");
    }
  }
}
