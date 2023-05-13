<%@ page import="java.time.Duration" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<% 
    HttpSession session = request.getSession(false);
    if (session != null) {
        String name = (String) session.getAttribute("name");
        LocalDateTime startTime = (LocalDateTime) session.getAttribute("startTime");
        Duration duration = Duration.between(startTime, LocalDateTime.now());
        session.invalidate();
%>
<html>

<head>
  <title>Logout Page</title>
</head>

<body>
  <h2>Thank You, <%= name %>!</h2>
  <p>Duration of Usage: <%= duration.toMinutes() %> minutes</p>
</body>

</html>
<%
    } else {
%>
<html>

<head>
  <title>Error Page</title>
</head>

<body>
  <h2>Error: Session Expired!</h2>
</body>

</html>
<%
    }
%>