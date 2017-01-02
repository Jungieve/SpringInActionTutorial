<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: congzihan
  Date: 17/1/1
  Time: 上午1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/Resources/style.css" />">
</head>
<body>
<h1>Welcome to Spitter</h1>
<a href="<c:url value="/spittles"/>">Spitters</a>
<a href="<c:url value="/spittles/register" />">Register</a>
</body>
</html>