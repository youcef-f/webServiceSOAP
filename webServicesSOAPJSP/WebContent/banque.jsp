<%@page import="service.BanqueWebServiceProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	double montant = 0;
	double resultat = 0;

	if (request.getParameter("montant") != null) {
		montant = Double.parseDouble(request.getParameter("montant"));
		BanqueWebServiceProxy service = new BanqueWebServiceProxy();
		resultat = service.conversionEuroToDirham(montant);
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversion euro en dihram</title>
</head>
<body>
	<form action="banque.jsp">
		Montant :<input type="text" name="montant" value="<%=montant%>">
		<input type="submit" value="OK">
	</form>
	<%=montant%> en Euro est égale à <%=resultat%> en dihram
</body>
</html>



