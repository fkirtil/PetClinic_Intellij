<%--
  Created by IntelliJ IDEA.
  User: F_KIRTIL
  Date: 21.09.2023
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="owner" method="post">
        First Name:<form:input path="firstName"/><br/>
        Last Name:<form:input path="lastName"/><br/>
        <form:button name="submit">Delete</form:button>
    </form:form>
</body>
</html>
