<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>MySSM</title>
</head>
<body>
    <h2>Hello SSM!</h2>
    <c:forEach items="${list}" var="user">
        ${user.id}--${user.name}--${user.password}--${user.score}--${user.birthday} <br/>
    </c:forEach>
</body>
</html>
