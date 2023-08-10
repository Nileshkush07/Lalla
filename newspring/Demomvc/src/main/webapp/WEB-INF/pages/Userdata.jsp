<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
hui hui
</p>
<p>

id:${obj.uid}
name:${obj.uname}
role:${obj.urole}

</p>
<table border=1px>

<tr>
<th>id</th>
<th>name</th>
<th>role</th>
</tr>

<c:forEach var="ob" items="${listobj}">

<tr>
<td>${ob.uid}</td>
<td>${ob.uname }</td>
<td>${ob.urole }</td>
</tr>

</c:forEach>

</table>
</body>
</html>