<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>tlist.jsp</title>
</head>
<body>
<c:forEach var="e" items="${list }">
<h1>${e.num } / ${e.title }</h1>
</c:forEach>

</body>
</html>