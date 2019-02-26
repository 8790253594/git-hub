<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=request.getParameter("name");
if(username!=null){
	session.setAttribute("sessionname", username);
application.setAttribute("Applicationname", username);	
 pageContext.setAttribute("PageContext",username);
 
// pageContext.setAttribute("Applicationname",username,pageContext.APPLICATION_SCOPE);
pageContext.findAttribute("name");
}%>
<br>
the username is <%=username%>
<br>
the session name is :<%=session.getAttribute("sessionname")%>
the application name is : <%=application.getAttribute("Applicationname") %>
<br>
the page context is :<%=pageContext.getAttribute("PageContext") %>

</body>
</html>