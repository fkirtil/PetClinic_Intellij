<%--
  Created by IntelliJ IDEA.
  User: F_KIRTIL
  Date: 21.09.2023
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="owner" method="post">
        First Name:<form:input path="firstName"/>
        <form:errors path="firstName" cssStyle="color: red"/>
        <br/>
        Last Name:<form:input path="lastName"/>
        <form:errors path="lastName" cssStyle="color: red"/>
        <br/>
        <form:button name="submit">Update</form:button>
    </form:form>
</body>
</html>
