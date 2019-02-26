<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%! public void jspInit()
{
	String Defaultuser=getServletConfig().getInitParameter("Defaultuser");
	ServletContext context=getServletContext();
	context.setAttribute("Defaultuser",Defaultuser);
	
}%>
<body>
The defaultUser browser:<%=getServletConfig().getInitParameter("Defaultuser") %>

</body>
</html>