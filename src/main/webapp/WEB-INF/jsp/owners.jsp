<%--
  Created by IntelliJ IDEA.
  User: F_KIRTIL
  Date: 12.08.2023
  Time: 00:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr style="font-weight: bold;" bgcolor="lightblue">
        <td>ID</td>
        <td>First Name</td>
        <td>Last Name</td>
    </tr>
    </thead>
    <c:forEach items="${owners}" var="owner" varStatus="status">
        <tr bgcolor="${status.index % 2 == 0 ? 'white' : 'lightgray'}">
            <td>${owner.id}</td>
            <td>${owner.firstName}</td>
            <td>${owner.lastName}</td>
        </tr>
    </c:forEach>
</table>
<c:if test="${not empty message}">
    <div style="color: aquamarine">
        ${message}
    </div>
</c:if>
</body>
</html>
