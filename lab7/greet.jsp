<%@ page import="java.time.LocalDateTime" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<% 
    String name = request.getParameter("name");
    HttpSession session = request.getSession();
    session.setAttribute("name", name);
    session.setAttribute("startTime", LocalDateTime.now());
%>
<html>

<head>
  <title>Greeting Page</title>
</head>

<body>
  <h2>Hello, <%= name %>!</h2>
  <p>Start Time: <%= LocalDateTime.now() %></p>
  <form action="logout.jsp" method="post">
    <input type="submit" value="Logout" />
  </form>
</body>

</html>