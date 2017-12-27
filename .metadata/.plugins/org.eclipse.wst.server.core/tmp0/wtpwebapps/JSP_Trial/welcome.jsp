<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- <head> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <title>Insert title here</title>
</head>
<body>

</body>
</html> -->
<body>
<%-- <% String name=request.getParameter("uname");
out.print("welcome "+name);
%> --%>
<%-- <%! int data=50; %>
<%="value of variable: "+data %> --%>
<%-- <%! int cube(int n){
	return n*n*n;}%>
<%="value of cube"+cube(3) %> --%>

<%
	out.print("Welcome"+request.getParameter("uname"));
	
	String driver = application.getInitParameter("dname");
	out.print("driver name is="+driver);
	%>

</body>
</html>