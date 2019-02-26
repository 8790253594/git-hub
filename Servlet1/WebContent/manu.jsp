<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public static int add(int a,int b)
{
	return a+b;
	}
%>>

<%

int i=5;
int j=8;
int k=i+j;
out.println(k);%>

<% 
 k=add(1100,100);
%>
the output is:<%=k %>
<% for (i=0;i<5;i++){ %>
the output of for loop is :<%=i %>

<%} %>


</body>
</html>